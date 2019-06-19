package com.ming.organizationtest;


import com.ming.organization.entity.OrganizationEntity;
import com.ming.organization.service.OrganizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrganizationTest {

    @Autowired
    OrganizationService service;
    @Autowired
    OrganizationEntity organizationEntity;

    /*添加组织*/
    @Test
    public void addOrganization() {
        organizationEntity.setOrganizationName("明");
        organizationEntity.setOrganizationSuperior(1);
        int addResult = service.addOrganization(organizationEntity);
        System.out.println("成功添加" + addResult + "条组织");
    }


    /*删除组织*/
    @Test
    public void delectOrganization() {
        int delectResult = service.delectOrganization(2);
        System.out.println("成功删除" + delectResult + "条组织");
    }


    /*修改组织*/
    @Test
    public void alertOrganization() {
    }


    /*修改组织名称*/
    @Test
    public void alertOrganizationName() {
    }


    /*查询组织*/
    @Test
    public void getOrganization() {
    }


    /*查询组织名称*/
    @Test
    public void getOrganizationName() {
        System.out.println(service.getOrganizationName(1));
    }
}
