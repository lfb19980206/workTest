package com.lfb.springboot.mapper;

import com.lfb.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    User login(User user);

    @Select("select * from user where id = #{id}")
    User findUserById(int id);

    @Select("select * from user where username = #{username}")
    User findUserByUsername(String username);
}
