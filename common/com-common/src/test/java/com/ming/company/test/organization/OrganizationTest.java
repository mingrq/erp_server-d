package com.ming.company.test.organization;


import com.ming.company.organization.entity.OrganizationEntity;
import com.ming.company.organization.service.OrganizationService;
import com.ming.sql.Exceptions.SqlAddDataFailureException;
import com.ming.sql.Exceptions.SqlAlterFailureException;
import com.ming.sql.Exceptions.SqlDataUniqueException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        organizationEntity.setOrganizationName("医wS务d室");
        organizationEntity.setOrganizationSuperior(1);
        try {
            OrganizationEntity addResult = null;
            addResult = service.addOrganization(organizationEntity);
            System.out.println("成功添加" + addResult + "条组织,id=" + addResult.getOrganizationId());
        } catch (SqlDataUniqueException e) {
            System.out.println("已存在");
        } catch (SqlAddDataFailureException e) {
            //e.printStackTrace();
            System.out.println("fgd已存在");
        }
    }

    /*批量添加组织*/
    @Test
    public void addBatchOrganization() {
        List<OrganizationEntity> organizationEntities = new ArrayList<>();
        OrganizationEntity organizationEntity1 = new OrganizationEntity();
        organizationEntity1.setOrganizationName("医务室1");
        organizationEntity1.setOrganizationSuperior(1);
        OrganizationEntity organizationEntity2 = new OrganizationEntity();
        organizationEntity2.setOrganizationName("实验室1");
        //organizationEntity2.setOrganizationSuperior(1);
        organizationEntities.add(organizationEntity1);
        organizationEntities.add(organizationEntity2);
        List<OrganizationEntity> result = null;
        try {
            result = service.addBatchOrganization(organizationEntities);
        } catch (SqlDataUniqueException e) {
            e.printStackTrace();
        } catch (SqlAddDataFailureException e) {
            e.printStackTrace();
        }
        System.out.println("成功添加" + result + "条组织,id");
        for (OrganizationEntity entity : organizationEntities) {
            System.out.println("id=" + entity.getOrganizationId());
        }

    }

    /*删除组织*/
    @Test
    public void delectOrganization() {
       /* int delectResult = service.delectOrganization(42);
        System.out.println("成功删除" + delectResult + "条组织");*/
    }


    /*批量删除组织*/
    @Test
    public void delectBatchOrganization() {
       /* List<Integer> delectIds = new ArrayList<>();
        delectIds.add(40);
        delectIds.add(41);
        int delectResult = service.delectBatchOrganization(delectIds);
        System.out.println("成功删除" + delectResult + "条组织");*/
    }

    /*修改组织*/
    @Test
    public void alertOrganization() {
        OrganizationEntity entity = new OrganizationEntity();
        entity.setOrganizationId(56);
        //entity.setOrganizationName("gsgju");
        entity.setOrganizationSuperior(1);
        try {
            int alertResult = service.alertOrganization(entity);
            System.out.println("成功修改" + alertResult + "条组织");
        } catch (SqlAlterFailureException e) {
            System.out.println("成功修改" + "sdfsdfs" + "条组织");
        }
    }

    /*批量修改组织*/
    @Test
    public void alertBatchOrganization() {
        OrganizationEntity entity = new OrganizationEntity();
        entity.setOrganizationId(56);
        entity.setOrganizationName("asf");
        entity.setOrganizationSuperior(1);
        OrganizationEntity entity1 = new OrganizationEntity();
        entity1.setOrganizationId(57);
        entity1.setOrganizationSuperior(2);
        entity1.setOrganizationName("asdf");
        List<OrganizationEntity> entities = new ArrayList<>();
        entities.add(entity);
        entities.add(entity1);
        int alertBatchResult = service.alertBatchOrganization(entities);
        System.out.println("成功修改" + alertBatchResult + "条组织");
    }


    /*查询组织*/
    @Test
    public void getOrganization() {
        OrganizationEntity entity = service.getOrganization(2);
        System.out.println("成功查询" + entity.toString());
    }


    /*查询所有组织*/
    @Test
    public void getOrganizationList() {
        List<OrganizationEntity> organizationEntities =  service.getOrganizationList();
        System.out.println("成功查询" + organizationEntities.toString());
    }

    /*查询组织名称*/
    @Test
    public void getOrganizationName() {
        System.out.println(service.getOrganizationName(2));
    }

    /*查询组织创建时间*/
    @Test
    public void getOrganizationGenTime() {
        System.out.println(service.getOrganizationGenTime(2));
    }

    /*查询上级组织*/
    @Test
    public void getOrganizationSuperior() {
        System.out.println(service.getOrganizationSuperior(2));
    }

    /**
     * 查询用户所在的公司与子公司集
     *
     */
    @Test
    public void getCompanyAndSon() {
        List companyAndSon =  service.getCompanyAndSon(0);
        System.out.println(companyAndSon);
    }
}
