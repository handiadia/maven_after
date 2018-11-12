package com.baizhi.entity;

import java.util.List;

public class User {
    private Integer id;
    private String username;
    //法名
    private String dharmaname;
    //头像地址
    private String image;
    private String sex;
    private String address;
    //签名
    private String signature;
    private String password;
    //状态
    private String state;
    //多个功课记录
    private List<Workrecord> workrecordList;

    public User() {
    }

    public User(Integer id, String username, String dharmaname, String image, String sex, String address, String signature, String password, String state, List<Workrecord> workrecordList) {
        this.id = id;
        this.username = username;
        this.dharmaname = dharmaname;
        this.image = image;
        this.sex = sex;
        this.address = address;
        this.signature = signature;
        this.password = password;
        this.state = state;
        this.workrecordList = workrecordList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDharmaname() {
        return dharmaname;
    }

    public void setDharmaname(String dharmaname) {
        this.dharmaname = dharmaname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Workrecord> getWorkrecordList() {
        return workrecordList;
    }

    public void setWorkrecordList(List<Workrecord> workrecordList) {
        this.workrecordList = workrecordList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", dharmaname='" + dharmaname + '\'' +
                ", image='" + image + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", signature='" + signature + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", workrecordList=" + workrecordList +
                '}';
    }
}
