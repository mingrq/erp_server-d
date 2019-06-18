package com.ming.userinfo.entity;


/**
 * 用户个人信息
 */
public class UserInfoEntity {
    //用户Id
    private int userId;
    //用户姓名
    private String userName;
    //用户性别
    private int userSex;
    //用户身份证号
    private String userNumber;
    //用户电话号码
    private String userPhone;
    //用户手机号
    private String userMobile;
    //用户住址
    private String userSite;
    //用户银行卡号
    private String userBank;
    //用户邮箱
    private String userEmail;
    //用户注册时间
    private String userGenTime;
    //用户头像
    private String userPortrait;
    //用户状态 0：在职&1：离职
    private int userState;
    //用户离职时间
    private String userLeaveTime;
    //用户登录系统用户名
    private String userLoginName;
    //用户登录系统用户密码
    private String userLoginPw;
    //用户账号状态 -1：冻结不可用 0：离线 & 1：在线 & 2：免打扰
    private int identificationState;
    //用户所在组织id
    private int userOrganization;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserSite() {
        return userSite;
    }

    public void setUserSite(String userSite) {
        this.userSite = userSite;
    }

    public String getUserBank() {
        return userBank;
    }

    public void setUserBank(String userBank) {
        this.userBank = userBank;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGenTime() {
        return userGenTime;
    }

    public void setUserGenTime(String userGenTime) {
        this.userGenTime = userGenTime;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public String getUserLeaveTime() {
        return userLeaveTime;
    }

    public void setUserLeaveTime(String userLeaveTime) {
        this.userLeaveTime = userLeaveTime;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserLoginPw() {
        return userLoginPw;
    }

    public void setUserLoginPw(String userLoginPw) {
        this.userLoginPw = userLoginPw;
    }

    public int getIdentificationState() {
        return identificationState;
    }

    public void setIdentificationState(int identificationState) {
        this.identificationState = identificationState;
    }

    public int getUserOrganization() {
        return userOrganization;
    }

    public void setUserOrganization(int userOrganization) {
        this.userOrganization = userOrganization;
    }
}
