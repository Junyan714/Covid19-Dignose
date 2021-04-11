package com.jyzhang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DailyRecordsController {

    @RequestMapping("/dailyRecords")
    public String medical(){
        return "user_center_site.html";
    }
}
