package com.pt.model;

import java.util.Date;

public class Praise {
    private Long id;

    private Long circleid;

    private Long praiser;

    private Date praisetime;

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

    public Long getPraiser() {
        return praiser;
    }

    public void setPraiser(Long praiser) {
        this.praiser = praiser;
    }

    public Date getPraisetime() {
        return praisetime;
    }

    public void setPraisetime(Date praisetime) {
        this.praisetime = praisetime;
    }
}