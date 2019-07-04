package com.ming.sql.Exceptions;

/**
 * 执行Sql违反数据唯一性错误
 */
public class SqlDataUniqueException extends Exception {


    public SqlDataUniqueException(Throwable cause) {
        super(cause);
        //SQLIntegrityConstraintViolationException exception = (SQLIntegrityConstraintViolationException) cause;
    }

}
