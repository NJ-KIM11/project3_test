package com.ohgiraffers.crewboard.dto;

import java.sql.Date;

public class CrewBoardDTO {

    private int postNo;
    private int crewNo;
    private int userNo;
    private Date postDate;
    private String postTitle;
    private String postContent;
    private String postStatus;

    public CrewBoardDTO() {
    }

    public CrewBoardDTO(int postNo, int crewNo, int userNO, Date postDate, String postTitle, String postContent, String postStatus) {
        this.postNo = postNo;
        this.crewNo = crewNo;
        this.userNo = userNo;
        this.postDate = postDate;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postStatus = postStatus;
    }

    public int getPostNo() {
        return postNo;
    }

    public void setPostNo(int postNo) {
        this.postNo = postNo;
    }

    public int getCrewNo() {
        return crewNo;
    }

    public void setCrewNo(int crewNo) { this.crewNo = crewNo; }

    public int getUserNo() { return userNo; }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    @Override
    public String toString() {
        return "CrewBoardDTO{" +
                "postNo=" + postNo +
                ", crewNo=" + crewNo +
                ", userNo=" + userNo +
                ", postDate=" + postDate +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postStatus='" + postStatus + '\'' +
                '}';
    }
}
