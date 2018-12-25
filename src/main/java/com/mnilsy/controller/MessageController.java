package com.mnilsy.controller;

import com.alibaba.fastjson.JSON;
import com.mnilsy.bean.AttentionList;
import com.mnilsy.pojo.MessagePojo;
import com.mnilsy.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by MNILSY on 2018/12/24.
 */
@Controller
public class MessageController {
    @Resource(name = "messageService")
    private MessageService messageService;

    @RequestMapping(value = "/getAttention.json")
    @ResponseBody
    //获取关注的人
    public String getAttention(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ArrayList<AttentionList> list = messageService.getAttention((String) session.getAttribute("u_Id"));
        return JSON.toJSONString(list);
    }

    @RequestMapping(value = "/selectAttention.json")
    @ResponseBody
    //查找聊天对象
    public String selectAttention(HttpServletRequest request, String key) {
        HttpSession session = request.getSession();
        ArrayList<AttentionList> list = messageService.selectAttention(key, (String) session.getAttribute("u_Id"));
        return JSON.toJSONString(list);
    }

    @RequestMapping(value = "/sendMessage.do")
    @ResponseBody
    //发信息
    public String sendMessage(MessagePojo messagePojo, HttpServletRequest request) {
        HttpSession session = request.getSession();
        messagePojo.setM_Sender((String) session.getAttribute("u_Id"));
        messagePojo.setM_Time(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return messageService.sendMessage(messagePojo);
    }

    @RequestMapping(value = "/getMessage.json")
    @ResponseBody
    //获取未读取的信息
    public String getMessage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        //没有未读消息则为null
        return messageService.getMessage((String) session.getAttribute("u_Id"));
    }

    @RequestMapping(value = "/read.do")
    public void read(String m_Sender, String m_Time, HttpServletRequest request) {
        HttpSession session = request.getSession();
        messageService.read(m_Sender, (String) session.getAttribute("u_Id"), m_Time);
    }
}
