package com.travel.model;

import java.util.Date;

public class TbTravelShareMst {
    private Integer travelId;

    private String userId;

    private String travelName;

    private String travelPictureUrl;

    private String travelAdress;

    private String travelSummary;

    private Boolean isActive;

    private String createUserId;

    private Date createDatetime;

    private String lastUpdateUserId;

    private Date lastUpdateDatetime;

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName == null ? null : travelName.trim();
    }

    public String getTravelPictureUrl() {
        return travelPictureUrl;
    }

    public void setTravelPictureUrl(String travelPictureUrl) {
        this.travelPictureUrl = travelPictureUrl == null ? null : travelPictureUrl.trim();
    }

    public String getTravelAdress() {
        return travelAdress;
    }

    public void setTravelAdress(String travelAdress) {
        this.travelAdress = travelAdress == null ? null : travelAdress.trim();
    }

    public String getTravelSummary() {
        return travelSummary;
    }

    public void setTravelSummary(String travelSummary) {
        this.travelSummary = travelSummary == null ? null : travelSummary.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    public Date getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    public void setLastUpdateDatetime(Date lastUpdateDatetime) {
        this.lastUpdateDatetime = lastUpdateDatetime;
    }
}