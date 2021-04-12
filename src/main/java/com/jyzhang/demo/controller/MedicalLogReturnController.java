package com.jyzhang.demo.controller;

import com.jyzhang.demo.dao.StudentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicalLogReturnController {
    @RequestMapping("/medicalReturnLog")
    public String medicalReturn(
            @RequestParam("cough") String cough,
            @RequestParam("fever") String fever,
            @RequestParam("loss") String loss,
            @RequestParam("ashes") String ashes,
            @RequestParam("nose") String nose,
            @RequestParam("doctor") String doctor){

        int id = StudentDao.currentId;
        int count = Integer.parseInt(cough) + Integer.parseInt(fever) +Integer.parseInt(loss) +
                Integer.parseInt(ashes) +Integer.parseInt(nose) +Integer.parseInt(doctor);
        StudentDao.setMedicalStatus(id, count);
        return "user_center_info.html";
    }
}
