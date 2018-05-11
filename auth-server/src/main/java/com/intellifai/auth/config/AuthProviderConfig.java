/*
 * #{copyright}#
 */
package com.intellifai.auth.config;

import com.pudding.core.zuul.ZuulClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;

/**
 * @author chenjingxiong
 */
@Configuration
public class AuthProviderConfig {

    @Bean
    public AuthenticationProvider userAuthProvider(ZuulClient zuulClient) {
        return new UserAuthProvider(zuulClient);
    }

}
