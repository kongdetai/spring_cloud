package com.intellifai.user.web;

import com.alibaba.fastjson.JSONObject;
import com.intellifai.user.entity.IntellifaiUserB;
import com.intellifai.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by david on 2018/4/26.
 */

@RestController
@RequestMapping("/usr/info")
public class UserInfoResouce {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUserByName", method = RequestMethod.POST)
    public Object getUserByName(@RequestBody String userName) {
        System.out.println(userName);

        return JSONObject.toJSON(userService.getUserInfo(userName));
    }

}
