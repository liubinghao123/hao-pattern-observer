package com.hao.guava;

import com.google.common.eventbus.Subscribe;
import com.hao.observer.Gper;
import com.hao.Question;

import java.util.Observable;

/**
 *
 */
public class Teacher{

    private String name;

    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void updateForGuava(Question question) {
        System.out.println("==============================================================");
        System.out.println(name + "老师你好\n，" + "学员[ " + question.getName() +" ]提交了一个问题，问题内容是：" + question.getContent());
    }
}
