package com.ibrahimkuley.managment;

/**
 * Created by halil on 16.08.2014.
 */
public class AuthenticatationNot {

    private String msg;
    private String status;

    public AuthenticatationNot(String msg, String status) {
        this.msg = msg;
        this.status = status;
    }

    public AuthenticatationNot(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
