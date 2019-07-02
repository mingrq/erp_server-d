package com.ming.company.user.entity;

/**
 * 用户临时权限
 */
public class UserTemporaryLimitEntity {
    //用户id
    int userId;
    //权限id
    int limitsId;
    //权限状态
    int entrustState;
    //授权人id
    int entrustUserId;
    //授权时间
    String entrustTime;
    //结束授权时间
    String entrustOverTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLimitsId() {
        return limitsId;
    }

    public void setLimitsId(int limitsId) {
        this.limitsId = limitsId;
    }

    public int getEntrustState() {
        return entrustState;
    }

    public void setEntrustState(int entrustState) {
        this.entrustState = entrustState;
    }

    public int getEntrustUserId() {
        return entrustUserId;
    }

    public void setEntrustUserId(int entrustUserId) {
        this.entrustUserId = entrustUserId;
    }

    public String getEntrustTime() {
        return entrustTime;
    }

    public void setEntrustTime(String entrustTime) {
        this.entrustTime = entrustTime;
    }

    public String getEntrustOverTime() {
        return entrustOverTime;
    }

    public void setEntrustOverTime(String entrustOverTime) {
        this.entrustOverTime = entrustOverTime;
    }
}
