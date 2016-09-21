package com.pt.model;

import java.util.Date;

public class JobResume {
    private Integer id;

    private Integer jobid;

    private Integer resumeid;

    private Boolean ishandle;

    private String comment;

    private Integer handleuser;

    private Integer status;

    private Date createdate;

    private Date updatedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Boolean getIshandle() {
        return ishandle;
    }

    public void setIshandle(Boolean ishandle) {
        this.ishandle = ishandle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getHandleuser() {
        return handleuser;
    }

    public void setHandleuser(Integer handleuser) {
        this.handleuser = handleuser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}