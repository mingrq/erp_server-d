package com.ming.limits.entity;

public class Limits {
    //权限id
    private int LimitsId;
    //权限名称
    private String LimitsName;
    //父权权限id
    private int ParentLimitsId;

    public int getLimitsId() {
        return LimitsId;
    }

    public void setLimitsId(int limitsId) {
        LimitsId = limitsId;
    }

    public String getLimitsName() {
        return LimitsName;
    }

    public void setLimitsName(String limitsName) {
        LimitsName = limitsName;
    }

    public int getParentLimitsId() {
        return ParentLimitsId;
    }

    public void setParentLimitsId(int parentLimitsId) {
        ParentLimitsId = parentLimitsId;
    }
}
