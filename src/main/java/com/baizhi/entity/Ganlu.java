package com.baizhi.entity;

import java.util.List;

public class Ganlu {
    //甘露妙音
    private Integer id;
    private String name;
    private List<Introduction> introductions;

    public Ganlu() {
    }

    public Ganlu(Integer id, String name, List<Introduction> introductions) {
        this.id = id;
        this.name = name;
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

    public List<Introduction> getIntroductions() {
        return introductions;
    }

    public void setIntroductions(List<Introduction> introductions) {
        this.introductions = introductions;
    }

    @Override
    public String toString() {
        return "Ganlu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", introductions=" + introductions +
                '}';
    }
}
