package com.jyzhang.demo.dao;

import com.jyzhang.demo.pojo.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {

    private static Map<Integer, Student> students = null;

    static {
        students = new HashMap<Integer, Student>();

        students.put(101, new Student(101,"junyan", 1234, 1, 0, 0));
        students.put(102, new Student(102,"henian", 2234, 1, 3,6));
        students.put(103, new Student(103,"jie", 3234, 1,9,12));
        students.put(104, new Student(104,"yangmi",4234,2,3,3));
    }

    private static Integer initId = 105;
    public static Integer currentId = -1;

    public float getResult(){
        Student nowStudent = students.get(currentId);
        int grades = nowStudent.getMedicalStatus() + nowStudent.getDailyStatus();
        return (float)grades / 260;
    }

    public static void setMedicalStatus(int id, int status){
        Student newStudent = students.get(id);
        newStudent.setMedicalStatus(status);
        students.put(id, newStudent);
    }

    public static void setDailyStatus(int id, int status){
        Student newStudent = students.get(id);
        newStudent.setDailyStatus(status);
        students.put(id, newStudent);
    }

    public int getId(String username, String password) {
        for (int key: students.keySet()){
            Student existStudent = students.get(key);
            if (existStudent.getUsername().equals(username) && existStudent.getPassword() == Integer.parseInt(password)) {
                return key;
            }
        }
        return -1;
    }

    public static void setCurrentId(Integer Id) {
        currentId = Id;
    }
    public static int getInitId(){
        return initId;
    }

    public static void save(Student newStudent){
        if (newStudent.getId()==null){
            newStudent.setId(initId++);
        }

        students.put(newStudent.getId(), newStudent);
    }



}
