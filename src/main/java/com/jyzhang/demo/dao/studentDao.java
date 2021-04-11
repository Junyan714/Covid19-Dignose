package com.jyzhang.demo.dao;

import com.jyzhang.demo.pojo.student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class studentDao {

    private static Map<Integer, student> students = null;

    static {
        students = new HashMap<Integer, student>();

        students.put(101, new student(101,"junyan", 1234, 1, 0, 0));
        students.put(102, new student(102,"henian", 2234, 1, 3,6));
        students.put(103, new student(103,"jie", 3234, 1,9,12));
        students.put(104, new student(104,"yangmi",4234,2,3,3));
    }

    private static Integer initId = 105;
    public void save(student newStudent){
        if (newStudent.getId()==null){
            newStudent.setId(initId++);
        }

        students.put(newStudent.getId(), newStudent);
    }

}
