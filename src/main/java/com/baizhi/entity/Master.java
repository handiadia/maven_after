package com.baizhi.entity;

import java.util.List;

public class Master {
    //上师
    private Integer id;
    private String name;
    //状态
    private String state;
    private String image;
    private List<Introduction> introductions;

    public Master() {
    }

    public Master(Integer id, String name, String state, String image, List<Introduction> introductions) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.image = image;
        this.introductions = introductions;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Introduction> getIntroductions() {
        return introductions;
    }

    public void setIntroductions(List<Introduction> introductions) {
        this.introductions = introductions;
    }

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", image='" + image + '\'' +
                ", introductions=" + introductions +
                '}';
    }
}
