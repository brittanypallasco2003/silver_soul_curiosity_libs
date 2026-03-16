package com.silversoul.libs.core.domain;

import java.time.OffsetDateTime;

import com.silversoul.libs.core.enums.StatusEnum;


public class BaseModel {

    private String id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;
    private StatusEnum status;


    
    
    public BaseModel() {
    }
    public BaseModel(String id, OffsetDateTime createdAt, OffsetDateTime updatedAt, OffsetDateTime deletedAt,
            StatusEnum status) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.status = status;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
    public StatusEnum getStatus() {
        return status;
    }
    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    
    
    
}
