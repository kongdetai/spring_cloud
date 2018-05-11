package com.intellifai.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by david on 2018/4/26.
 */

@RestController
public class UserController {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/usr/info/getUserByName", method = RequestMethod.POST)
    public Object getUserByName(@RequestParam("userName") String userName) {

        System.out.println(userName);
        return restTemplate.postForEntity("http://user-service/usr/info/getUserByName",userName ,Object.class);
    }
}
