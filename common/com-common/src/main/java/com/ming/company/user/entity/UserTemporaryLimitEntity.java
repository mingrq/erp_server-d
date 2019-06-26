package com.ming.company.user.entity;

/**
 * 用户临时权限
 */
public class UserTemporaryLimitEntity {
    //用户id
    int UserId;
    //权限id
    int LimitsId;
    //权限状态
    int EntrustState;
    //授权人id
    int EntrustUserId;
    //授权时间
    String EntrustTime;
    //结束授权时间
    String EntrustOverTime;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getLimitsId() {
        return LimitsId;
    }

    public void setLimitsId(int limitsId) {
        LimitsId = limitsId;
    }

    public int getEntrustState() {
        return EntrustState;
    }

    public void setEntrustState(int entrustState) {
        EntrustState = entrustState;
    }

    public int getEntrustUserId() {
        return EntrustUserId;
    }

    public void setEntrustUserId(int entrustUserId) {
        EntrustUserId = entrustUserId;
    }

    public String getEntrustTime() {
        return EntrustTime;
    }

    public void setEntrustTime(String entrustTime) {
        EntrustTime = entrustTime;
    }

    public String getEntrustOverTime() {
        return EntrustOverTime;
    }

    public void setEntrustOverTime(String entrustOverTime) {
        EntrustOverTime = entrustOverTime;
    }
}
