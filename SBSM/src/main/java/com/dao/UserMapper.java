package com.dao;

import com.dao.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User queryById(@Param("id") long id);
}
