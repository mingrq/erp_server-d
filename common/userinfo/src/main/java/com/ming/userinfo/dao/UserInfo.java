package com.ming.userinfo.dao;

import com.ming.userinfo.entity.UserInfoEntity;

/**
 * 用户信息
 */
public interface UserInfo {
    /**
     * 添加用户
     */
    int addUser(UserInfoEntity userInfoEntity);

    /**
     * 修改用户
     */
    void alterUser(UserInfoEntity userInfoEntity);

    /**
     * 查询用户姓名
     */
    String getUserName(int userId);

    /**
     * 查询用户性别
     */
    int getUserSex(int userId);

    /**
     * 查询用户身份证号
     */
    String getUserNumber(int userId);

    /**
     * 查询用户电话号码
     */
    String getUserPhone(int userId);

    /**
     * 查询用户手机号码
     */
    String getUserMobile(int userId);

    /**
     * 查询用户住址
     */
    String getUserSite(int userId);

    /**
     * 查询用户银行卡号
     */
    String getUserBank(int userId);

    /**
     * 查询用户邮箱
     */
    String getUserEmail(int userId);

    /**
     * 查询用户头像地址
     */
    String getUserPortrait(int userId);

    /**
     * 查询用户状态--在职&离职
     */
    int getUserState(int userId);

    /**
     * 查询用户登录密码
     */
    String getUserLoginPw(int userId);

    /**
     * 查询用户账号状态
     */
    int getUserIdentificationState(int userId);

    /**
     * 查询用户所在组织
     */
    int getUserOrganization(int userId);

    /**
     * 查询用户信息
     */
    UserInfoEntity getUser(int id);
}
