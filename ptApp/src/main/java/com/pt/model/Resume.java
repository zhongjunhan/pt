package com.pt.model;

import java.util.Date;

public class Resume {
    private Long id;

    private String name;

    private Date birthday;

    private Integer education;//1：小学，2：初中，3：中专，4：高中，5：大专，6：本科及以上

    private String telephone;

    private Integer sex;

    private String idcardfrontpic;

    private String idcardbackpic;

    private String qualificationspic;

    private String workexperience;

    private String workvoice;

    private String skill;

    private String skillvoice;

    private Long creatorid;

    private Date createtime;

    private Date modifytime;

    private Integer status;//0:新建，1:停用 ，9：删除

    private Integer iscertified;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdcardfrontpic() {
        return idcardfrontpic;
    }

    public void setIdcardfrontpic(String idcardfrontpic) {
        this.idcardfrontpic = idcardfrontpic;
    }

    public String getIdcardbackpic() {
        return idcardbackpic;
    }

    public void setIdcardbackpic(String idcardbackpic) {
        this.idcardbackpic = idcardbackpic;
    }

    public String getQualificationspic() {
        return qualificationspic;
    }

    public void setQualificationspic(String qualificationspic) {
        this.qualificationspic = qualificationspic;
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience;
    }

    public String getWorkvoice() {
        return workvoice;
    }

    public void setWorkvoice(String workvoice) {
        this.workvoice = workvoice;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkillvoice() {
        return skillvoice;
    }

    public void setSkillvoice(String skillvoice) {
        this.skillvoice = skillvoice;
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

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIscertified() {
        return iscertified;
    }

    public void setIscertified(Integer iscertified) {
        this.iscertified = iscertified;
    }
}