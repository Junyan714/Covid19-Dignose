package com.jyzhang.demo.controller;

import com.jyzhang.demo.dao.StudentDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session){

        StudentDao studentDao = new StudentDao();
        int id = studentDao.getId(username, password);

        if (id > 0){
            StudentDao.setCurrentId(id);
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","username or password unavailable");
            return "login.html";
        }
    }
}
