/*
 * #{copyright}#
 */
package com.intellifai.auth.config;

import com.pudding.core.security.User;
import com.pudding.core.zuul.ZuulClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenjingxiong
 */
public class UserAuthProvider implements AuthenticationProvider {

    private static Logger logger = LoggerFactory.getLogger(UserAuthProvider.class);

    private ZuulClient zuulClient;

    protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();

    public UserAuthProvider(ZuulClient zuulClient) {
        this.zuulClient = zuulClient;
    }

    public UserDetails loadUserByUsername(String userName) {
//        // TODO: 根据不同平台传递不同参数
        Map<String, Object> urlVariables = new HashMap<>();
        urlVariables.put("userName",userName);
        return zuulClient.getForObject("user-service/user/oAuth/get", User.class, urlVariables);
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String password = (String)authentication.getCredentials();
        UserDetails userDetails = this.loadUserByUsername(userName);
        if(userDetails == null) {
            logger.debug("Authentication failed: user doesn't exists!");
            throw new BadCredentialsException(this.messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
        } else {
            if(!userDetails.getPassword().equals(password)) {
                logger.debug("Authentication failed: password does not match stored value");
                throw new BadCredentialsException(this.messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
            } else {
                return new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
            }
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
