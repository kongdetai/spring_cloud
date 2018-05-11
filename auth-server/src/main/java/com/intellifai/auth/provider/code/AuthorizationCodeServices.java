/*
 * #{copyright}#
 */
package com.intellifai.auth.provider.code;

import org.springframework.security.oauth2.common.util.RandomValueStringGenerator;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;

import javax.sql.DataSource;

/**
 * @author chenjingxiong
 */
public class AuthorizationCodeServices extends JdbcAuthorizationCodeServices{

    private RandomValueStringGenerator generator = new RandomValueStringGenerator(32);

    public AuthorizationCodeServices(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String createAuthorizationCode(OAuth2Authentication authentication) {
        String code = generator.generate();
        store(code, authentication);
        return code;
    }
}
