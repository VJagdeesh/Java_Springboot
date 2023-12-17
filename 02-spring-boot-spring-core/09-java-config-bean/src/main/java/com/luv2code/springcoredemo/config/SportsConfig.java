package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
//    The below method name is used as bean id in qualifier
// Also can pass bean id in braces
    @Bean("swimCoachAqua")
    public Coach  swimCoach(){
        return new SwimCoach();
    }
}
