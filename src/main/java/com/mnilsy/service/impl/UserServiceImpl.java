package com.mnilsy.service.impl;

import com.mnilsy.dao.UsersMapper;
import com.mnilsy.entity.User;
import com.mnilsy.pojo.UsersPojo;
import com.mnilsy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MNILSY on 2018/11/8.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int login_password(String u_Id, String u_Password) {
        UsersPojo usersPojo = usersMapper.getUser_u_Id(u_Id);
        if (usersPojo == null) return -1;
        if (u_Password.equals(usersPojo.getU_Password())) return 1;
        return 0;
    }

    @Override
    public UsersPojo login_code(String phone) {
        UsersPojo usersPojo = usersMapper.getUser_phone(phone);
        return usersPojo;
    }

    @Override
    public int register(String u_Id, String u_Password, String u_Phone) {
        UsersPojo usersPojo = usersMapper.getUser_u_Id(u_Id);
        if (usersPojo != null) {
            return -1;
        }
        usersPojo = usersMapper.getUser_phone(u_Phone);
        if (usersPojo != null) {
            return -2;
        }
        return usersMapper.addUser(u_Id, u_Password, u_Phone);
    }

    @Override
    public boolean updatePassword(String u_Id, String newPassword) {
        return usersMapper.updatePassword(newPassword, u_Id) == 1;
    }

    @Override
    public UsersPojo getUsers(String u_Id) {
        return usersMapper.getUser_u_Id(u_Id);
    }
}
