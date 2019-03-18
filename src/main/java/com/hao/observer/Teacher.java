package com.hao.observer;

import com.hao.Question;

import java.util.Observable;
import java.util.Observer;

/**
 *
 */
public class Teacher implements Observer{

    private String name;

    public Teacher(String name){
        this.name = name;
    }


    public void update(Observable o, Object arg) {
        Gper gper = (Gper) o;
        Question question = (Question) arg;
        System.out.println("==============================================================");
        System.out.println(name + "老师你好\n，" + "学员[ " + question.getName() +" ]提交了一个问题，问题内容是：" + question.getContent());
    }
}
