package com.mnilsy.dao;

import com.mnilsy.pojo.UsersPojo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


/**
 * Created by MNILSY on 2018/11/8.
 */
@Repository("userMapper")
@Mapper
public interface UsersMapper {
    @Select("SELECT * FROM users WHERE u_Id=#{u_Id}")
    UsersPojo getUser_u_Id(String u_Id);

    @Select("SELECT * FROM users WHERE u_Phone=#{phone}")
    UsersPojo getUser_phone(String phone);

    @Insert("INSERT INTO users(u_Id,u_Password,u_Phone) VALUES (#{u_Id},#{u_Password},#{u_Phone})")
    int addUser(@Param("u_Id") String u_Id, @Param("u_Password") String u_Password, @Param("u_Phone") String Phone);

    @Update("UPDATE users SET u_Password=#{newPassword} WHERE u_Id=#{u_Id}")
    int updatePassword(@Param("newPassword") String newPassword,@Param("u_Id") String u_Id);
}
