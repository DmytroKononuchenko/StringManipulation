package com.mainacad.model;

public class ConectionInfo implements Comparable<ConectionInfo> {

    private User user;
    private Integer sessionId;
    private String userIp;
    private Long time;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public ConectionInfo() {
    }

    public ConectionInfo(Integer sessionId, String userIp, Long time, User user) {
        this.user = user;
        this.sessionId = sessionId;
        this.userIp = userIp;
        this.time = time;
    }

    @Override
    public int compareTo(ConectionInfo conectionInfo) {
        if (this.time > conectionInfo.time) {
            return 1;
        } else if (this.time < conectionInfo.time) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return time + " " + sessionId + " " + userIp + " " + user.getLogin();
    }
}
