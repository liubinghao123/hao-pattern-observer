package com.hao.guava;

import com.google.common.eventbus.EventBus;
import com.hao.Question;

/**
 *
 */
public class GuavaTest {
    public static void main(String[] args){
        Question question = new Question("albert","如何在项目中使用设计模式？");
        Teacher tom = new Teacher("tom");

        EventBus bus = new EventBus();
        bus.register(tom);
        bus.post(question);
    }
}
