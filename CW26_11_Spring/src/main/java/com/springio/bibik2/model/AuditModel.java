package com.springio.bibik2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updateAt"},
        allowGetters = true
)
public abstract class AuditModel implements Serializable {
    @Column(name="created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date createAt;

    @Column(name="created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date updateAt;

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }
}
