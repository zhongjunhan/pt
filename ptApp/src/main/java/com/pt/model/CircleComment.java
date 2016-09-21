package com.pt.model;

import java.util.Date;

public class CircleComment {
    private Long id;

    private Long circleid;

    private String comment;

    private Long commentatorid;

    private Date commenttime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCircleid() {
        return circleid;
    }

    public void setCircleid(Long circleid) {
        this.circleid = circleid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getCommentatorid() {
        return commentatorid;
    }

    public void setCommentatorid(Long commentatorid) {
        this.commentatorid = commentatorid;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}