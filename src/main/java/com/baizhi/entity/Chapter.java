package com.baizhi.entity;

public class Chapter {
    //章节
    private Integer id;
    private String name;
    private String filename;
    //文件大小
    private String filesize;
    private Integer jixiang_id;

    public Chapter() {
    }

    public Chapter(Integer id, String name, String filename, String filesize, Integer jixiang_id) {
        this.id = id;
        this.name = name;
        this.filename = filename;
        this.filesize = filesize;
        this.jixiang_id = jixiang_id;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public Integer getJixiang_id() {
        return jixiang_id;
    }

    public void setJixiang_id(Integer jixiang_id) {
        this.jixiang_id = jixiang_id;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", filename='" + filename + '\'' +
                ", filesize='" + filesize + '\'' +
                ", jixiang_id=" + jixiang_id +
                '}';
    }
}
