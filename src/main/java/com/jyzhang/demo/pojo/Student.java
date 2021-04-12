package com.jyzhang.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String username;
    private int password;
    private Integer gender;
    private Integer medicalStatus;
    private Integer dailyStatus;


}
