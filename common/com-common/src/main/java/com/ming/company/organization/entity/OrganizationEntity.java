package com.ming.company.organization.entity;

import org.springframework.stereotype.Component;

@Component
public class OrganizationEntity {
    //组织id
    private int OrganizationId;
    //组织名称
    private String OrganizationName;
    //上级组织id
    private int OrganizationSuperior = -1;
    //创建时间
    private String OrganizationGenTime;

    public int getOrganizationId() {
        return OrganizationId;
    }

    public void setOrganizationId(int organizationId) {
        OrganizationId = organizationId;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }

    public int getOrganizationSuperior() {
        return OrganizationSuperior;
    }

    public void setOrganizationSuperior(int organizationSuperior) {
        OrganizationSuperior = organizationSuperior;
    }

    public String getOrganizationGenTime() {
        return OrganizationGenTime;
    }

    public void setOrganizationGenTime(String organizationGenTime) {
        OrganizationGenTime = organizationGenTime;
    }

}
