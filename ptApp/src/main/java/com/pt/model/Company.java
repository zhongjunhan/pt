package com.pt.model;

import java.util.Date;

public class Company {
    private Long id;

    private String name;

    private Integer status;//0：审核中，1：通过2：失败

    private Integer certifiedstatus;//认证状态0:未认证，1：企业，2：中介

    private Integer companysize;//公司规模 1:100人以下，2:100-500人，3:500-1000人，4：1000-5000人，5：5000-10000人，6:10000人以上

    private String logo;

    private String legalperson;

    private String credentials;

    private String video;

    private Integer companynature;//公司性质 1:中介，2：国企，3:外企，4：民营

    private String description;

    private String address;

    private Double longitude;

    private Double latitude;

    private String contactor;

    private String telephone;

    private String sponsor;

    private String auditcomments;

    private Integer auditorid;

    private Date audittime;

    private Long creatorid;

    private Date createtime;

    private Long modifierid;

    private Date modifytime;

    private Integer cityid;

    private Integer ishire;

    private Integer isapplicationin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCertifiedstatus() {
        return certifiedstatus;
    }

    public void setCertifiedstatus(Integer certifiedstatus) {
        this.certifiedstatus = certifiedstatus;
    }

    public Integer getCompanysize() {
        return companysize;
    }

    public void setCompanysize(Integer companysize) {
        this.companysize = companysize;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Integer getCompanynature() {
        return companynature;
    }

    public void setCompanynature(Integer companynature) {
        this.companynature = companynature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getAuditcomments() {
        return auditcomments;
    }

    public void setAuditcomments(String auditcomments) {
        this.auditcomments = auditcomments;
    }

    public Integer getAuditorid() {
        return auditorid;
    }

    public void setAuditorid(Integer auditorid) {
        this.auditorid = auditorid;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Long getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getModifierid() {
        return modifierid;
    }

    public void setModifierid(Long modifierid) {
        this.modifierid = modifierid;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getIshire() {
        return ishire;
    }

    public void setIshire(Integer ishire) {
        this.ishire = ishire;
    }

    public Integer getIsapplicationin() {
        return isapplicationin;
    }

    public void setIsapplicationin(Integer isapplicationin) {
        this.isapplicationin = isapplicationin;
    }
}