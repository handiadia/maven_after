package com.baizhi.entity;

public class Introduction {
    //文章简介
    private Integer id;
    private String name;
    private String image;
    //创建时间
    private String releaseDate;
    //作者
    private String author;
    //简介
    private String introduction;

    public Introduction() {
    }

    public Introduction(Integer id, String name, String image, String releaseDate, String author, String introduction) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.releaseDate = releaseDate;
        this.author = author;
        this.introduction = introduction;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Introduction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", author='" + author + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
