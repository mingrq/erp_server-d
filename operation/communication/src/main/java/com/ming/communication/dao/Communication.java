package com.ming.communication.dao;

import java.util.List;
import java.util.Map;

public interface Communication {
    /*获取通讯录*/
    List getAddressBookList();

    /*获取通讯录详情*/
    Map getAddressBookDetail(int userId);
}
