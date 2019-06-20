package com.sql.Exceptions;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 执行Sql违反数据唯一性错误
 */
public class SqlDataUniqueException extends Exception {


    public SqlDataUniqueException(Throwable cause) {
        super(cause);
        //SQLIntegrityConstraintViolationException exception = (SQLIntegrityConstraintViolationException) cause;
    }

}
