package com.baizhi.entity;

public class Counter {
    private Integer id;
    //计数器名
    private String counter_name;
    //当前计数
    private String count;
    //创建时间
    private String releaseDate;

    public Counter() {
    }

    public Counter(Integer id, String counter_name, String count, String releaseDate) {
        this.id = id;
        this.counter_name = counter_name;
        this.count = count;
        this.releaseDate = releaseDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCounter_name() {
        return counter_name;
    }

    public void setCounter_name(String counter_name) {
        this.counter_name = counter_name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                ", counter_name='" + counter_name + '\'' +
                ", count='" + count + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
