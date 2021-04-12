package com.jyzhang.demo.controller;

import com.jyzhang.demo.dao.StudentDao;
import com.jyzhang.demo.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LikelyhoodController {

    @RequestMapping("/likelyhood")
    public String likelyhood(HttpSession session){

        StudentDao studentDao = new StudentDao();
        float res = studentDao.getResult();
        String possibility = res * 100 + "%";
        session.setAttribute("possibility", possibility);

        return "user_center_likelyhood.html";
    }
}
