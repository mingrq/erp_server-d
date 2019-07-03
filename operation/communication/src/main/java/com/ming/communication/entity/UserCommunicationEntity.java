package com.ming.communication.entity;

import org.springframework.stereotype.Component;

/**
 * 用户通讯信息类
 */
@Component
public class UserCommunicationEntity {
    //用户Id
    private int userId;
    //用户姓名
    private String userName;
    //用户性别
    private int userSex;
    //用户电话号码
    private String userPhone;
    //用户手机号
    private String userMobile;
    //用户邮箱
    private String userEmail;
    //用户头像
    private String userPortrait;
    //用户所在组织id
    private int userOrganization;
}
