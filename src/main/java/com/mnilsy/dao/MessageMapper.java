package com.mnilsy.dao;

import com.mnilsy.bean.AttentionList;
import com.mnilsy.bean.MessageBean;
import com.mnilsy.pojo.MessagePojo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by MNILSY on 2018/12/24.
 */
@Repository("messageMapper")
@Mapper
public interface MessageMapper {
    @Select("SELECT users.u_Id,users.u_Head,users.u_Nickname FROM attention JOIN users ON attention.att_You=users.u_Id WHERE attention.att_Me=#{u_Id}")
    ArrayList<AttentionList> getAttention(String u_Id);


    @Select("SELECT u_Id,u_Head,u_Nickname FROM users WHERE u_Id LIKE concat(#{key},'%')")
    ArrayList<AttentionList> selectAttention_all(String key);

    @Select("SELECT users.u_Id,users.u_Head,users.u_Nickname FROM attention JOIN users ON attention.att_You=users.u_Id WHERE attention.att_Me=#{u_Id} AND attention.att_You LIKE concat(#{key},'%')")
    ArrayList<AttentionList> selectAttention_attention(@Param(value = "u_Id") String u_Id,@Param(value = "key") String key);

    @Insert("INSERT INTO message(m_Recipient, m_Sender, m_Context, m_Time) VALUES (#{m_Recipient},#{m_Sender},#{m_Context},#{m_Time})")
    int putMessage(MessagePojo messagePojo);

    @Select("SELECT u_Head FROM users WHERE u_Id=#{u_Id}")
    String getHead(String u_Id);

    @Select("SELECT message.*,users.u_Head,users.u_Nickname FROM message JOIN users ON message.m_Sender=users.u_Id WHERE message.m_Isread=0 AND message.m_Recipient=#{u_Id} ORDER BY message.m_Time DESC")
    ArrayList<MessageBean> getMessage(String u_Id);

    @Update("UPDATE message SET m_Isread=1 WHERE m_Sender=#{m_Sender} AND m_Recipient=#{m_Recipient} AND m_Time=#{m_Time}")
    int read(@Param(value = "m_Sender") String m_Sender,@Param(value = "m_Recipient") String m_Recipient,@Param(value = "m_Time") String m_Time);
}
