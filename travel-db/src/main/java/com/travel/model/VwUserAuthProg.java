package com.travel.model;

public class VwUserAuthProg {
    private String userId;

    private String userName;

    private String progId;

    private String progNameTw;

    private String parentProgId;

    private String progUrl;

    private String progIcon;

    private Integer progSort;

    private String progType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

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

    public String getParentProgId() {
        return parentProgId;
    }

    public void setParentProgId(String parentProgId) {
        this.parentProgId = parentProgId == null ? null : parentProgId.trim();
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
}