package com.ming.company.organization.entity;

/**
 * 组织权限
 */
public class OrganizationLimitEntity {
    //组织id
    int OrganizationId;
    //权限id
    int LimitId;

    public int getOrganizationId() {
        return OrganizationId;
    }

    public void setOrganizationId(int organizationId) {
        OrganizationId = organizationId;
    }

    public int getLimitId() {
        return LimitId;
    }

    public void setLimitId(int limitId) {
        LimitId = limitId;
    }
}
