package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("Constructor is "+getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStuff(){
        System.out.println("I do my start up stuff "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("I do my clean up stuff "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise throwing";
    }
}
