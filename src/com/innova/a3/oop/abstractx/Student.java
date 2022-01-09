package com.innova.a3.oop.abstractx;

public class Student extends  Person{

    @Override
    public void govdeliMethod() {
        super.govdeliMethod();
        System.out.println("Student Gövdeli method");
    }

    @Override
    public void govdelisizMethod() {
        System.out.println("Gövdesiz method Student");
    }
}
