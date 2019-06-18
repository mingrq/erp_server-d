package com.ming.organization.dao;

import com.ming.organization.entity.OrganizationEntity;

import java.util.List;


/**
 * 组织信息
 */
public interface Organization {
    /**
     * 添加组织
     * @param entity 组织实体
     */
    void addOrganization(OrganizationEntity entity);

    /**
     * 删除组织
     * @param organizationId 组织id
     */
    void delectOrganization(int organizationId);

    /**
     * 修改组织
     * @param entity 组织实体
     */
    void alertOrganization(OrganizationEntity entity);

    /**
     * 查询组织
     * @param organizationId 组织id
     */
    OrganizationEntity getOrganization(int organizationId);

    /**
     * 查询所有组织
     * @return List<OrganizationEntity>集合
     */
    List<OrganizationEntity> getOrganizationList();

    /**
     * 查询组织名称
     * @param organizationId 组织id
     * @return 组织名称
     */
    String getOrganizationName(int organizationId);

    /**
     * 查询组织创建时间
     * @param organizationId 组织id
     * @return 创建时间
     */
    String getOrganizationGenTime(int organizationId);

    /**
     * 查询上级组织id
     * @param organizationId 组织id
     * @return 上级组织id
     */
    int getOrganizationSuperiorId(int organizationId);
}
