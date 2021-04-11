package com.jyzhang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MedicalLogController {

    @RequestMapping("/medicalLog")
    public String medical(){
        return "user_center_order.html";
    }
}
