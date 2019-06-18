package com.ming.userinfo.dao;

import com.ming.userinfo.entity.UserInfoEntity;

/**
 * 用户信息
 */
public interface UserInfo {
    /**
     * 添加用户
     */
    void addUser(UserInfoEntity userInfoEntity);

    /**
     * 修改用户姓名
     */
    void alterUserName(String userName);

    /**
     * 修改用户性别
     */
    void alterUserSex(int sex);

    /**
     * 修改用户身份证号
     */
    void alterUserNumber(String number);

    /**
     * 修改用户电话号码
     */
    void alterUserPhone(String phone);

    /**
     * 修改用户手机号码
     */
    void alterUserMobile(String mobile);

    /**
     * 修改用户住址
     */
    void alterUserSite(String site);

    /**
     * 修改用户银行卡号
     */
    void alterUserBank(String bank);

    /**
     * 修改用户邮箱
     */
    void alterUserEmail(String email);

    /**
     * 修改用户头像地址
     */
    void alterUserPortrait(String portrait);

    /**
     * 修改用户状态--在职&离职
     */
    void alterUserState(int state);

    /**
     * 修改用户登录密码
     */
    void alterUserLoginPw(String pw);

    /**
     * 修改用户账号状态
     */
    void alterUserIdentificationState(int identificationState);

    /**
     * 修改用户所在组织
     */
    int alterUserOrganization(int organizationId);

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
