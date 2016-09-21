package com.pt.model;

import java.util.Date;

public class CheckImage {
    private Integer id;

    private Integer jobresumeid;

    private Date createdate;

    private Date updatedate;

    private String images;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobresumeid() {
        return jobresumeid;
    }

    public void setJobresumeid(Integer jobresumeid) {
        this.jobresumeid = jobresumeid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}