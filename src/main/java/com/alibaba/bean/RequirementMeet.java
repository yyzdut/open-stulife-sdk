package com.alibaba.bean;

import javax.persistence.*;

/**
 * @Author: ModestYjx
 * @Project: open-stulife-sdk
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/12/10 10:09
 */
@Table(name="requirement_table")
@Entity
public class RequirementMeet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long promoter_id;
    private String activity_name;
    private String activity_des;
    private String activity_image;
    private String comment;
    private String release_time;
    private String update_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getPromoter_id() {
        return promoter_id;
    }

    public void setPromoter_id(Long promoter_id) {
        this.promoter_id = promoter_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_des() {
        return activity_des;
    }

    public void setActivity_des(String activity_des) {
        this.activity_des = activity_des;
    }

    public String getActivity_image() {
        return activity_image;
    }

    public void setActivity_image(String activity_image) {
        this.activity_image = activity_image;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
