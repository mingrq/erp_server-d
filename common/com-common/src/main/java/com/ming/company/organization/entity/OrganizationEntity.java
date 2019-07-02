package com.ming.company.organization.entity;

import org.springframework.stereotype.Component;

@Component
public class OrganizationEntity {
    //组织id
    private int organizationId;
    //组织名称
    private String organizationName;
    //上级组织id
    private int organizationSuperior = -1;
    //创建时间
    private String organizationGenTime;

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public int getOrganizationSuperior() {
        return organizationSuperior;
    }

    public void setOrganizationSuperior(int organizationSuperior) {
        this.organizationSuperior = organizationSuperior;
    }

    public String getOrganizationGenTime() {
        return organizationGenTime;
    }

    public void setOrganizationGenTime(String organizationGenTime) {
        this.organizationGenTime = organizationGenTime;
    }

}
