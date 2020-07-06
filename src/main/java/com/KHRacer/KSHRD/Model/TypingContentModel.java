package com.KHRacer.KSHRD.Model;

public class TypingContentModel {
    private int id;
    private String khContent;
    private String title;
    private String description;
    private String author;
    private String regex;


    public TypingContentModel() {
    }

    public TypingContentModel(int id, String khContent,String regex ,String title, String description, String author) {
        this.id = id;
        this.khContent = khContent;
        this.title = title;
        this.description = description;
        this.author = author;
        this.regex=regex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKhContent() {
        return khContent;
    }

    public void setKhContent(String khContent) {
        this.khContent = khContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
