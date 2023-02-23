package com.son.resumeapp;


public class ProjectListItem {

    private String title;
    private String duration;
    private String link;

    public ProjectListItem(String title, String duration, String link) {
        this.title = title;
        this.duration = duration;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }


    public String getDuration() {
        return duration;
    }


    public String getLink() {
        return link;
    }

}
