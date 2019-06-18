package com.ming.organization.service;

import com.ming.organization.dao.Organization;
import com.ming.organization.entity.OrganizationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrganizationService {

    @Autowired
    private Organization organization;

    /*添加组织*/
    public void addOrganization(OrganizationEntity entity) {
        organization.addOrganization(entity);
    }

    /*删除组织*/
    public void delectOrganization(int organizationId) {
    }

    /*修改组织*/
    public void alertOrganization(OrganizationEntity entity) {
    }

    /*修改组织名称*/
    public void alertOrganizationName(int organizationId) {
    }

    /*查询组织*/
    public void getOrganization(int organizationId) {

    }

    /*查询组织名称*/
    public String getOrganizationName(int organizationId) {
        return organization.getOrganizationName(organizationId);
    }

    /*查询所有组织*/
}
