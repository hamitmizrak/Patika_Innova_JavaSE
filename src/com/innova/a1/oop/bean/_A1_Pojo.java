package com.innova.a1.oop.bean;

//plain old java object
public class _A1_Pojo {

    //nesne değişkenleri (object variable)
    private int studentId;
    private String studentName;

    //getter and setter
    //Intellij Idea shortCut: Alt+Insert

    //class değişkeni class variable
    //static private  String studentSurname;

    public int getStudentId() {
        return studentId;
    }

    public _A1_Pojo setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public _A1_Pojo setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }




}
