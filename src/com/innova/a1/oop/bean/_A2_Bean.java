package com.innova.a1.oop.bean;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class _A2_Bean implements Serializable {

    // nesne değişkenleri (object variable)
    private int studentId;
    private String studentName;
    private String studentSurname;
    private Date createdDate;

    // parametresiz constructor:
    //return hayır
    //
    public  _A2_Bean() {
        this.studentName="Mehmet";
        createdDate=new Date(System.currentTimeMillis());
        //this("asd","fsd");
    }

    // parametreli constructor

    public _A2_Bean(int studentId, String studentName, String studentSurname) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public _A2_Bean( String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }


    // toString

    @Override
    public String toString() {
        return "_A2_Bean{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }


    // equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _A2_Bean a2_bean = (_A2_Bean) o;
        return studentId == a2_bean.studentId && Objects.equals(studentName, a2_bean.studentName) && Objects.equals(studentSurname, a2_bean.studentSurname) && Objects.equals(createdDate, a2_bean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSurname, createdDate);
    }


    // method
    public void fullName(){
        System.out.println(this.studentName+" "+this.studentSurname);
    }


    //getter and setter

    public int getStudentId() {
        return studentId;
    }

    public _A2_Bean setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public _A2_Bean setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public _A2_Bean setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public _A2_Bean setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }
}
