package com.hao.observer;

import com.hao.Question;

import java.util.Observable;

/**
 *观察者
 */
public class Gper extends Observable {

    private String name = "咕泡生态圈";

    private static Gper gper = null;

    private Gper(){

    }

    public static Gper getInstance(){
        if(gper == null){
            gper = new Gper();
        }
        return gper;
    }

    public void pulishQuestion(Question question){
        System.out.println("学员[ " + question.getName() +" ]提交了一个问题，问题内容是：" + question.getContent());
        //通知被观察者
        setChanged();
        notifyObservers(question);

    }


}
