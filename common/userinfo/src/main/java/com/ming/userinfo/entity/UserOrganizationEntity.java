package com.ming.userinfo.entity;

/**
 * 用户组织
 */
public class UserOrganizationEntity {

    //用户组织id
    private int OrganizationId;
    //用户组织名称
    private int OrganizationName;
    //用户上级组织id
    private int OrganizationSuperior;

    public int getOrganizationId() {
        return OrganizationId;
    }

    public void setOrganizationId(int organizationId) {
        OrganizationId = organizationId;
    }

    public int getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(int organizationName) {
        OrganizationName = organizationName;
    }

    public int getOrganizationSuperior() {
        return OrganizationSuperior;
    }

    public void setOrganizationSuperior(int organizationSuperior) {
        OrganizationSuperior = organizationSuperior;
    }
}
