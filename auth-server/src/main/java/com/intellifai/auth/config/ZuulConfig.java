/*
 * #{copyright}#
 */
package com.intellifai.auth.config;

import com.pudding.core.zuul.ZuulClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenjingxiong
 */
@Configuration
public class ZuulConfig {

    @Value("${api.gateway.url}")
    private String gatewayUrl;

    @Bean
    public ZuulClient zuulClient(RestTemplate restTemplate) {
        return new ZuulClient(gatewayUrl, restTemplate);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
