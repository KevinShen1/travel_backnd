package com.travel.model;

import java.util.Date;

public class TbSysProg {
    private String progId;

    private String progNameTw;

    private String progNameCn;

    private String progNameEn;

    private String parentProgId;

    private Boolean isActive;

    private String progUrl;

    private String progIcon;

    private Integer progSort;

    private String progType;

    private String createUserId;

    private Date createDatetime;

    private String lastUpdateEmpId;

    private Date lastUpdateDatetime;

    public String getProgId() {
        return progId;
    }

    public void setProgId(String progId) {
        this.progId = progId == null ? null : progId.trim();
    }

    public String getProgNameTw() {
        return progNameTw;
    }

    public void setProgNameTw(String progNameTw) {
        this.progNameTw = progNameTw == null ? null : progNameTw.trim();
    }

    public String getProgNameCn() {
        return progNameCn;
    }

    public void setProgNameCn(String progNameCn) {
        this.progNameCn = progNameCn == null ? null : progNameCn.trim();
    }

    public String getProgNameEn() {
        return progNameEn;
    }

    public void setProgNameEn(String progNameEn) {
        this.progNameEn = progNameEn == null ? null : progNameEn.trim();
    }

    public String getParentProgId() {
        return parentProgId;
    }

    public void setParentProgId(String parentProgId) {
        this.parentProgId = parentProgId == null ? null : parentProgId.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getProgUrl() {
        return progUrl;
    }

    public void setProgUrl(String progUrl) {
        this.progUrl = progUrl == null ? null : progUrl.trim();
    }

    public String getProgIcon() {
        return progIcon;
    }

    public void setProgIcon(String progIcon) {
        this.progIcon = progIcon == null ? null : progIcon.trim();
    }

    public Integer getProgSort() {
        return progSort;
    }

    public void setProgSort(Integer progSort) {
        this.progSort = progSort;
    }

    public String getProgType() {
        return progType;
    }

    public void setProgType(String progType) {
        this.progType = progType == null ? null : progType.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getLastUpdateEmpId() {
        return lastUpdateEmpId;
    }

    public void setLastUpdateEmpId(String lastUpdateEmpId) {
        this.lastUpdateEmpId = lastUpdateEmpId == null ? null : lastUpdateEmpId.trim();
    }

    public Date getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    public void setLastUpdateDatetime(Date lastUpdateDatetime) {
        this.lastUpdateDatetime = lastUpdateDatetime;
    }
}