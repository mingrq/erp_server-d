package com.ming.company.user.entity;

/**
 * 用户登录记录
 */
public class UserLoginRecordEntity {

    //用户登录时间
    private String loginTime;

    //用户登录来源 0:app & 1:window & 2:webpage & 3:AppleApp(苹果手机)
    private int loginSource;

    //用户token
    private String userToken;

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public int getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(int loginSource) {
        this.loginSource = loginSource;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
