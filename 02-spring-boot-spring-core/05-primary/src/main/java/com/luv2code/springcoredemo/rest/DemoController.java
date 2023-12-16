package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    @Autowired
    public void Demo(Coach theCoach){
    myCoach=theCoach;
    }

//    @Autowired
//    public void setCricCoach(@Qualifier("cricketCoach") Coach theCoach){
//        myCoach2=theCoach;
//    }
//    @GetMapping("/dailyworkout2")
//    public String getCoachInfo2()
//    {
//        return myCoach2.getDailyWorkout();
//    }
    @GetMapping("/dailyworkout")
    public String getCoachInfo()
    {
        return myCoach.getDailyWorkout();
    }
}
