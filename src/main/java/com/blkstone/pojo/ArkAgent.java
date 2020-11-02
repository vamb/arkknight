package com.blkstone.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author suyang
 * @since 2020-10-30
 */
@TableName("ark_agent")
public class ArkAgent implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String name;

    private String jobType;

    private Integer level;

    private Boolean isPublicToHire;

    private Boolean expLevel;

    private Boolean battlePosition;

    private Boolean genter;

    private String avatar;

    private String tags;

    @TableLogic
    private Boolean deleted;

    private Long createdBy;

    private Date createdDttm;

    private Long updatedBy;

    private Date updatedDttm;


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

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getPublicToHire() {
        return isPublicToHire;
    }

    public void setPublicToHire(Boolean isPublicToHire) {
        this.isPublicToHire = isPublicToHire;
    }

    public Boolean getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(Boolean expLevel) {
        this.expLevel = expLevel;
    }

    public Boolean getBattlePosition() {
        return battlePosition;
    }

    public void setBattlePosition(Boolean battlePosition) {
        this.battlePosition = battlePosition;
    }

    public Boolean getGenter() {
        return genter;
    }

    public void setGenter(Boolean genter) {
        this.genter = genter;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDttm() {
        return createdDttm;
    }

    public void setCreatedDttm(Date createdDttm) {
        this.createdDttm = createdDttm;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDttm() {
        return updatedDttm;
    }

    public void setUpdatedDttm(Date updatedDttm) {
        this.updatedDttm = updatedDttm;
    }

    @Override
    public String toString() {
        return "ArkAgent{" +
        "id=" + id +
        ", name=" + name +
        ", jobType=" + jobType +
        ", level=" + level +
        ", isPublicToHire=" + isPublicToHire +
        ", expLevel=" + expLevel +
        ", battlePosition=" + battlePosition +
        ", genter=" + genter +
        ", avatar=" + avatar +
        ", tags=" + tags +
        ", deleted=" + deleted +
        ", createdBy=" + createdBy +
        ", createdDttm=" + createdDttm +
        ", updatedBy=" + updatedBy +
        ", updatedDttm=" + updatedDttm +
        "}";
    }
}
