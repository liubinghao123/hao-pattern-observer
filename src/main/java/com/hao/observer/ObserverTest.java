package com.hao.observer;

import com.hao.Question;

/**
 *
 */
public class ObserverTest {
    public static void main(String[] args){
        Question question = new Question("albert","如何在项目中使用设计模式?");

        Teacher tom = new Teacher("tom");
        Gper gper = Gper.getInstance();
        //向tom老师提问
        gper.addObserver(tom);
        gper.pulishQuestion(question);

    }
}
