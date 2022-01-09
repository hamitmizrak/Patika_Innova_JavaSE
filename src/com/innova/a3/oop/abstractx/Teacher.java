package com.innova.a3.oop.abstractx;

public class Teacher extends Person{
    @Override
    public void govdeliMethod() {
        super.govdeliMethod();
        System.out.println("Teacher Gövdeli method");
    }

    @Override
    public void govdelisizMethod() {
        System.out.println("Teacher method Student");
    }
}
