package com.jyzhang.demo.controller;


import com.jyzhang.demo.dao.StudentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DailyRecordsReturnController {

    @RequestMapping("/dailyRecordsReturn")
    public String daily(@RequestParam("trips") String trips){
        int id = StudentDao.currentId;
        int count = Integer.parseInt(trips);
        StudentDao.setDailyStatus(id, count);
        return "user_center_info.html";

    }
}
