package com.baizhi.entity;

import java.util.List;

public class Menu {
    private Integer id;
    //菜单项
    private String title;
    //图片路径
    private String iconCls;
    //导入链接
    private String href;
    private List<Menu> menus;

    public Menu() {
    }

    public Menu(Integer id, String title, String iconCls, String href, List<Menu> menus) {
        this.id = id;
        this.title = title;
        this.iconCls = iconCls;
        this.href = href;
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", href='" + href + '\'' +
                ", menus=" + menus +
                '}';
    }
}
