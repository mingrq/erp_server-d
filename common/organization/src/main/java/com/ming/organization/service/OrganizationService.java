package com.ming.organization.service;

import com.ming.organization.dao.Organization;
import com.ming.organization.entity.OrganizationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganizationService {

    @Autowired
    private Organization organization;

    /**
     * 添加组织
     *
     * @param entity 组织实体
     */
    public void addOrganization(OrganizationEntity entity) {
        organization.addOrganization(entity);
    }

    /**
     * 删除组织
     *
     * @param organizationId 组织id
     */
    public void delectOrganization(int organizationId) {
        organization.delectOrganization(organizationId);
    }

    /**
     * 修改组织
     *
     * @param entity 组织实体
     */
    public void alertOrganization(OrganizationEntity entity) {
        organization.alertOrganization(entity);
    }

    /**
     * 查询组织
     *
     * @param organizationId 组织id
     */
    public void getOrganization(int organizationId) {
        organization.getOrganization(organizationId);
    }

    /**
     * 查询所有组织
     *
     * @return List<OrganizationEntity>集合
     */
    public List<OrganizationEntity> getOrganizationList() {
        return organization.getOrganizationList();
    }

    /**
     * 查询组织名称
     *
     * @param organizationId 组织id
     * @return 组织名称
     */
    public String getOrganizationName(int organizationId) {
        return organization.getOrganizationName(organizationId);
    }

    /**
     * 查询组织创建时间
     *
     * @param organizationId 组织id
     * @return 创建时间
     */
    public String getOrganizationGenTime(int organizationId) {
        return organization.getOrganizationGenTime(organizationId);
    }

    /**
     * 查询上级组织id
     *
     * @param organizationId 组织id
     * @return 上级组织id
     */
    public int getOrganizationSuperiorId(int organizationId) {
        return organization.getOrganizationSuperiorId(organizationId);
    }
}
