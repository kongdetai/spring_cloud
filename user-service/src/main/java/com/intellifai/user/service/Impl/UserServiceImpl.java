package com.intellifai.user.service.Impl;

import com.intellifai.user.entity.IntellifaiUserB;
import com.intellifai.user.mappers.IntellifaiUserBMapper;
import com.intellifai.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by david on 2018/4/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    IntellifaiUserBMapper intellifaiUserBMapper;

    @Override
    public IntellifaiUserB getUserInfo(String userName) {
        return intellifaiUserBMapper.getUserByName(userName);
    }
}



