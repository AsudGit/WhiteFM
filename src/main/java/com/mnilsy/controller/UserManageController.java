package com.mnilsy.controller;

import com.mnilsy.bean.UpdateUsersBean;
import com.mnilsy.pojo.MessagePojo;
import com.mnilsy.pojo.UsersPojo;
import com.mnilsy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by MNILSY on 2018/12/22.
 */
@Controller
public class UserManageController {
    @Resource(name = "userService")
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/index.html")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login.html")
    //跳转到登录页面
    public String go_login() {
        return "login";
    }

    @RequestMapping(value = "/login_password.do")
    @ResponseBody
    //账号和密码登录
    public String login_password(String u_Id, String u_Password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int i = userService.login_password(u_Id, u_Password);
        String zt = null;
        switch (i) {
            case -1:
                zt = "404";
                break;
            case 0:
                zt = "500";
                break;
            case 1:
                zt = "200";
                session.setAttribute("u_Id", u_Id);
                break;
            default:
                zt = "400";
        }
        return zt;
    }

    @RequestMapping(value = "/login_code.do")
    @ResponseBody
    //手机和验证码登录
    public String login_code(HttpServletRequest request, String u_Phone, String code) {
        HttpSession session = request.getSession();
        String zt;
        UsersPojo usersPojo;
        if (!(u_Phone.equals(session.getAttribute("phoneNumber")) && code.equals(session.getAttribute("phoneCode"))))
            zt = "500";
        else if ((usersPojo = userService.login_code(u_Phone)) != null) {
            zt = "200";
            session.removeAttribute("phoneNumber");
            session.removeAttribute("phoneCode");
            session.setAttribute("u_Id", usersPojo.getU_Id());
        } else zt = "404";
        return zt;
    }

    @RequestMapping(value = "/getCode.do")
    @ResponseBody
    //发送验证码
    public String sendCode(HttpServletRequest request, String u_Phone) {
        HttpSession session = request.getSession();
        String code = String.valueOf((int) (Math.random() * 1000000));
        String zt = "400";
        while (code.length() != 6) {
            code = String.valueOf((int) (Math.random() * 1000000));
        }
        System.out.println(code);
        try {
            if (/*Sms.sendSms(u_Phone, code)*/true) {
                zt = "200";
                session.setAttribute("phoneNumber", u_Phone);
                session.setAttribute("phoneCode", code);
            } else zt = "500";
        } catch (/*ClientException*/Exception e) {
            e.printStackTrace();
        }
        return zt;
    }

    @RequestMapping(value = "/register.html")
    public String register_to() {
        return "register";
    }

    @RequestMapping(value = "/register.do")
    @ResponseBody
    //注册
    public String register(HttpServletRequest request, String u_Id, String u_Password, String u_Phone, String code) {
        HttpSession session = request.getSession();
        String zt = null;
        if (!code.equals(session.getAttribute("phoneCode"))) {
            zt = "500";
            return zt;
        }
        if (!u_Phone.equals(session.getAttribute("phoneNumber"))) {
            zt = "501";
            return zt;
        }
        int i = userService.register(u_Id, u_Password, u_Phone);
        switch (i) {
            case -2:
                zt = "502";
                break;
            case -1:
                zt = "503";
                break;
            case 0:
                zt = "504";
                break;
            case 1:
                zt = "200";
                session.setAttribute("u_Id", u_Id);
                break;
            default:
                zt = "400";
        }
        return zt;
    }

    @RequestMapping(value = "/updatePassword.do")
    @ResponseBody
    //找回密码
    public String findPassword(HttpServletRequest request, String newPassword, String code) {
        HttpSession session = request.getSession();
        String zt = null;
        if (!code.equals(session.getAttribute("phoneCode"))) {
            zt = "验证码不正确";
            return zt;
        }
        if (userService.updatePassword((String) session.getAttribute("u_Id"), newPassword)) {
            zt = "200";
        }
        return zt;
    }


    @RequestMapping(value = "/@{u_Id}")
    //跳转到用户主页面
    public String userManage(@PathVariable String u_Id, HttpServletRequest request, Model model) {
        UsersPojo usersPojo = userService.getUsers(u_Id);
        if (usersPojo == null) {
            return "404";
        }
        model.addAttribute("usersPojo", usersPojo);
        return "userHome";
    }

    @RequestMapping(value = "/updatedata.do")
    //修改资料
    public String updatedata(UpdateUsersBean users) {
        return null;
    }

}
