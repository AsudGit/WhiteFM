package com.mnilsy.service;

import com.mnilsy.entity.User;
import com.mnilsy.pojo.UsersPojo;

import java.util.List;

/**
 * Created by MNILSY on 2018/11/8.
 */
public interface UserService {
    int login_password(String u_Id,String u_Password);
    UsersPojo login_code(String u_Phone);
    int register(String u_Id,String u_Password,String u_Phone);
    boolean updatePassword(String u_Id,String newPassword);
    UsersPojo getUsers(String u_Id);
}
