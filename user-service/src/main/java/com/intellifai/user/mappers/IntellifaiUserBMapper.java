package com.intellifai.user.mappers;

import com.intellifai.user.entity.IntellifaiUserB;
import tk.mybatis.mapper.common.Mapper;

public interface IntellifaiUserBMapper extends Mapper<IntellifaiUserB> {
    IntellifaiUserB getUserByName(String userName);
}