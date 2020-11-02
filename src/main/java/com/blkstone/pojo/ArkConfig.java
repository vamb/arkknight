package com.blkstone.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author suyang
 * @since 2020-10-30
 */
public class ArkConfig implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String code;

    private String label;

    private String value;

    @TableLogic
    private Boolean deleted;

    private String arkConfigcol;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getArkConfigcol() {
        return arkConfigcol;
    }

    public void setArkConfigcol(String arkConfigcol) {
        this.arkConfigcol = arkConfigcol;
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
        return "ArkConfig{" +
        "id=" + id +
        ", code=" + code +
        ", label=" + label +
        ", value=" + value +
        ", deleted=" + deleted +
        ", arkConfigcol=" + arkConfigcol +
        ", createdBy=" + createdBy +
        ", createdDttm=" + createdDttm +
        ", updatedBy=" + updatedBy +
        ", updatedDttm=" + updatedDttm +
        "}";
    }
}
