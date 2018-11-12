package com.baizhi.entity;

public class Shuffing {
    //轮播图
    private String id;
    private String image;
    private String name;
    //状态
    private String state;
    //创建时间
    private String releaseDate;

    public Shuffing() {
    }

    public Shuffing(String id, String image, String name, String state, String releaseDate) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.state = state;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Shuffing{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
