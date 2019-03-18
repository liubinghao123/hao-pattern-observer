package com.hao;

/**
 *问题
 */
public class Question {

    private String name;
    private String content;


    public Question(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
