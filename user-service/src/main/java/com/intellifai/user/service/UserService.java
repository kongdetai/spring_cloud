package com.intellifai.user.service;

import com.intellifai.user.entity.IntellifaiUserB;
import org.springframework.stereotype.Service;

/**
 * Created by david on 2018/4/26.
 */

public interface UserService {
    IntellifaiUserB getUserInfo(String userName);
}
