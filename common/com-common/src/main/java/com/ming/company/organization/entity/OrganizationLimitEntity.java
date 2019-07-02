package com.ming.company.organization.entity;

/**
 * 组织权限
 */
public class OrganizationLimitEntity {
    //组织id
    int organizationId;
    //权限id
    int limitId;

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }
}
