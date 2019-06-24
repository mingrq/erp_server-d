package com.ming.userinfo.entity;

/**
 * 用户登录记录
 */
public class UserLoginRecordEntity {

    //用户登录时间
    private String LoginTime;

    //用户登录来源 0:app & 1:window & 2:webpage & 3:AppleApp(苹果手机)
    private int LoginSource;

    //用户token
    private String userToken;

    public String getLoginTime() {
        return LoginTime;
    }

    public void setLoginTime(String loginTime) {
        LoginTime = loginTime;
    }

    public int getLoginSource() {
        return LoginSource;
    }

    public void setLoginSource(int loginSource) {
        LoginSource = loginSource;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
