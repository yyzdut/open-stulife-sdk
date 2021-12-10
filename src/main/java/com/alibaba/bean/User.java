package com.alibaba.bean;

/**
 * @Author: ModestYjx
 * @Project: open-stulife-sdk
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/12/10 10:17
 */
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String create_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
