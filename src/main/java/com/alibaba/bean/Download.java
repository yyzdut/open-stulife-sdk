package com.alibaba.bean;

/**
 * @Author: ModestYjx
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/11/30 20:58
 */
public class Download {
    private Long id;
    private String address;
    private String email;
    private String submit_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(String submit_time) {
        this.submit_time = submit_time;
    }
}
