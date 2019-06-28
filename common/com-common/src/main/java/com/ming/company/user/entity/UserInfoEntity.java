package com.ming.company.user.entity;


import com.ming.company.organization.entity.OrganizationEntity;
import com.ming.company.organization.entity.OrganizationLimitEntity;
import com.ming.company.role.entity.RoleEntity;
import com.ming.company.role.entity.RoleInfoEntity;
import com.ming.company.role.entity.RoleLimitEntity;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.util.List;

/**
 * 用户信息
 */
@Component
public class UserInfoEntity {
    //用户个人信息
    UserEntity userEntity;
    //用户上级组织集
    List<OrganizationEntity> organizationParentList;
    //临时权限集
    List<UserTemporaryLimitEntity> userTemporaryLimitList;
    //用户权限集
    //List<> roleLimitList;
    //用户角色集合
    List<RoleEntity> roleList;

}
