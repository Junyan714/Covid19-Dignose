package com.jyzhang.demo.controller;

import com.jyzhang.demo.dao.StudentDao;
import com.jyzhang.demo.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterNowController {

    @RequestMapping("/user/registerNow")
    public String registerNow(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("Cpassword") String Cpassword,
            @RequestParam("gender") String gender){

        if(!password.equals(Cpassword)){
            return "register.html";
        }else{
            Student student = new Student();
            int id = StudentDao.getInitId();
            student.setId(id);
            student.setUsername(username);
            student.setPassword(Integer.parseInt(password));
            student.setGender(Integer.parseInt(gender));
            student.setMedicalStatus(0);
            student.setDailyStatus(0);

            StudentDao.save(student);

            return "login.html";
        }
    }
}
