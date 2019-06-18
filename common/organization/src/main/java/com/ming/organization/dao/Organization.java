package com.ming.organization.dao;

import com.ming.organization.entity.OrganizationEntity;

import java.util.List;


/**
 * 组织信息
 */


public interface Organization {
    /*添加组织*/
    void addOrganization(OrganizationEntity entity);

    /*删除组织*/
    void delectOrganization(int organizationId);

    /*修改组织*/
    void alertOrganization(OrganizationEntity entity);

    /*查询组织*/
    OrganizationEntity getOrganization(int organizationId);

    /*查询所有组织*/
    List<OrganizationEntity> getOrganizationList();

    /*查询组织名称*/
    String getOrganizationName(int organizationId);

    /*查询组织创建时间*/
    String getOrganizationGenTime(int organizationId);

    /*查询上级组织id*/
    int getOrganizationSuperiorId(int organizationId);
}
