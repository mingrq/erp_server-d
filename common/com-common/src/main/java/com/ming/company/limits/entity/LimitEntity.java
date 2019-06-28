package com.ming.company.limits.entity;

public class LimitEntity {
    //权限id
    int LimitId;
    //权限名称
    String LimitName;
    //父权限id
    int ParentLimitsId;

    public int getLimitId() {
        return LimitId;
    }

    public void setLimitId(int limitId) {
        LimitId = limitId;
    }

    public String getLimitName() {
        return LimitName;
    }

    public void setLimitName(String limitName) {
        LimitName = limitName;
    }

    public int getParentLimitsId() {
        return ParentLimitsId;
    }

    public void setParentLimitsId(int parentLimitsId) {
        ParentLimitsId = parentLimitsId;
    }
}
