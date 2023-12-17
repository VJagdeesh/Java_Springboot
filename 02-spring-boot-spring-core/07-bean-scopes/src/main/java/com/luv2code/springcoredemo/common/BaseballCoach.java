package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("Constructor is "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise throwing";
    }
}
