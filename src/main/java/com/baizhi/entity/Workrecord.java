package com.baizhi.entity;

import java.util.List;
//功课记录
public class Workrecord {
    private Integer id;
    //功课名称
    private String workrecord_name;
    //多个计数器
    private List<Counter> counter;

    public Workrecord() {
    }

    public Workrecord(Integer id, String workrecord_name, List<Counter> counter) {
        this.id = id;
        this.workrecord_name = workrecord_name;
        this.counter = counter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkrecord_name() {
        return workrecord_name;
    }

    public void setWorkrecord_name(String workrecord_name) {
        this.workrecord_name = workrecord_name;
    }

    public List<Counter> getCounter() {
        return counter;
    }

    public void setCounter(List<Counter> counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Workrecord{" +
                "id=" + id +
                ", workrecord_name='" + workrecord_name + '\'' +
                ", counter=" + counter +
                '}';
    }
}
