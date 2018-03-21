package com.designpatterns.project;

public class MailTemplate {
    @Override
    public String toString() {
        return "MailTemplate{" +
                "to='" + to + '\'' +
                ", cc='" + cc + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    private String to;

    private String cc;

    private String title;

    private String content;

    public String getTo() {
        return to;
    }

    public String getCc() {
        return cc;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}