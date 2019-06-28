package com.ming.company.organization.dao;


import com.ming.company.organization.entity.OrganizationEntity;

import java.util.List;


/**
 * 组织信息
 */
public interface Organization {
    /**
     * 添加组织
     *
     * @param entity 组织实体
     */
    int addOrganization(OrganizationEntity entity);

    /**
     * 批量添加组织
     *
     * @param organizationEntities 组织实体集合
     * @return
     */
    int addBatchOrganization(List<OrganizationEntity> organizationEntities);


    /**
     * 删除组织
     *
     * @param organizationId 组织id
     */
    int deleteOrganization(int organizationId);

    /**
     * 批量删除组织
     *
     * @param organizationIds 组织id集合
     */
    int deleteBatchOrganization(List<Integer> organizationIds);

    /**
     * 修改组织
     *
     * @param entity 组织实体
     */
    int alertOrganization(OrganizationEntity entity);


    /**
     * 批量修改组织
     *
     * @param organizationEntities 组织实体集合
     */
    int alertBatchOrganization(List<OrganizationEntity> organizationEntities);

    /**
     * 查询组织
     *
     * @param organizationId 组织id
     */
    OrganizationEntity getOrganization(int organizationId);

    /**
     * 查询所有组织
     *
     * @return List<OrganizationEntity>集合
     */
    List<OrganizationEntity> getOrganizationList();

    /**
     * 查询组织名称
     *
     * @param organizationId 组织id
     * @return 组织名称
     */
    String getOrganizationName(int organizationId);

    /**
     * 查询组织创建时间
     *
     * @param organizationId 组织id
     * @return 创建时间
     */
    String getOrganizationGenTime(int organizationId);

    /**
     * 查询上级组织
     *
     * @param organizationId 组织id
     * @return 上级组织
     */
    OrganizationEntity getOrganizationSuperior(int organizationId);
}
