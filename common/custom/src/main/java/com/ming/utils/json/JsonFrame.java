package com.ming.utils.json;

import org.springframework.stereotype.Component;

@Component
public class JsonFrame<T> {
    //消息
    private int statusCode;
    //实体
    private T entity;
    //消息
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
