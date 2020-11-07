package com.cykj.mapper;

import com.cykj.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {

    User findUser(@Param("userName") String userName, @Param("userPwd") String userPwd);

}
