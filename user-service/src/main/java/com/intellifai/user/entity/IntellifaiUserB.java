package com.intellifai.user.entity;

import javax.persistence.*;

@Table(name = "intellifai_user_b")
public class IntellifaiUserB {
    @Id
    private Integer id;

    @Column(name = "user_number")
    private String userNumber;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_img")
    private String userImg;

    @Column(name = "user_fullname")
    private String userFullname;

    @Column(name = "user_type")
    private String userType;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_number
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * @param userNumber
     */
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return user_img
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * @param userImg
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    /**
     * @return user_fullname
     */
    public String getUserFullname() {
        return userFullname;
    }

    /**
     * @param userFullname
     */
    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    /**
     * @return user_type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
}