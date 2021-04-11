package com.jyzhang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class infoController {

    @RequestMapping("/info")
    public String medical(){
        return "user_center_info.html";
    }
}
