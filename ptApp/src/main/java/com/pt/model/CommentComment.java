package com.pt.model;

import java.util.Date;

public class CommentComment {
    private Long id;

    private Long commentid;

    private Long circleid;

    private String comment;

    private Integer replytoid;

    private Long commentatorid;

    private Date commenttime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
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

    public Integer getReplytoid() {
        return replytoid;
    }

    public void setReplytoid(Integer replytoid) {
        this.replytoid = replytoid;
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