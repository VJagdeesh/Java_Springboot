package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    public DemoController(Coach theCoach)
    {
        myCoach=theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getCoachInfo()
    {
        return myCoach.getDailyWorkout();
    }
}
