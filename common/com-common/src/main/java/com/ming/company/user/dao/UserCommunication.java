package com.ming.company.user.dao;

import java.util.List;
import java.util.Map;

public interface UserCommunication {
    /*获取通讯录*/
    List getAddressBookList();

    /*获取通讯录详情*/
    Map getAddressBookDetail(int userId);
}
