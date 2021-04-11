package com.jyzhang.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class student {
    private Integer id;
    private String account;
    private long password;
    private Integer gender;
    private Integer medicalStatus;
    private Integer dailyStatus;


}
