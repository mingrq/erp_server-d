package com.ming.company.limits.entity;

import org.springframework.stereotype.Component;

@Component
public class LimitEntity {
    //权限id
    int limitId;
    //权限名称
    String limitName;
    //父权限id
    int parentLimitsId;

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }

    public String getLimitName() {
        return limitName;
    }

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    public int getParentLimitsId() {
        return parentLimitsId;
    }

    public void setParentLimitsId(int parentLimitsId) {
        this.parentLimitsId = parentLimitsId;
    }
}
