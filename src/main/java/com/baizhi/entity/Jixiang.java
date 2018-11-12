package com.baizhi.entity;

import java.util.List;

public class Jixiang {
    //吉祥妙音
    private Integer id;
    private String name;
    private String image;
    //作者
    private String author;
    //播音
    private String broadcasting;
    //集数
    private String blues;
    //创建时间
    private String releaseDate;
    //简介
    private String introduction;
    private List<Chapter> children;

    public Jixiang() {
    }

    public Jixiang(Integer id, String name, String image, String author, String broadcasting, String blues, String releaseDate, String introduction, List<Chapter> children) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.author = author;
        this.broadcasting = broadcasting;
        this.blues = blues;
        this.releaseDate = releaseDate;
        this.introduction = introduction;
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBroadcasting() {
        return broadcasting;
    }

    public void setBroadcasting(String broadcasting) {
        this.broadcasting = broadcasting;
    }

    public String getBlues() {
        return blues;
    }

    public void setBlues(String blues) {
        this.blues = blues;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<Chapter> getChildren() {
        return children;
    }

    public void setChildren(List<Chapter> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Jixiang{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", author='" + author + '\'' +
                ", broadcasting='" + broadcasting + '\'' +
                ", blues='" + blues + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", introduction='" + introduction + '\'' +
                ", children=" + children +
                '}';
    }
}
