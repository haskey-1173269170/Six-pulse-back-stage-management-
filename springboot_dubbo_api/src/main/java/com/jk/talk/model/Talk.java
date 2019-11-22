package com.jk.talk.model;

import java.io.Serializable;

public class Talk implements Serializable {

    private Integer talkId;
    private Integer talkInfo;
    private Integer talkUserId;
    private Integer talkProductId;
    private Integer talkType;

    public Integer getTalkId() {
        return talkId;
    }

    public void setTalkId(Integer talkId) {
        this.talkId = talkId;
    }

    public Integer getTalkInfo() {
        return talkInfo;
    }

    public void setTalkInfo(Integer talkInfo) {
        this.talkInfo = talkInfo;
    }

    public Integer getTalkUserId() {
        return talkUserId;
    }

    public void setTalkUserId(Integer talkUserId) {
        this.talkUserId = talkUserId;
    }

    public Integer getTalkProductId() {
        return talkProductId;
    }

    public void setTalkProductId(Integer talkProductId) {
        this.talkProductId = talkProductId;
    }

    public Integer getTalkType() {
        return talkType;
    }

    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
    }
}
