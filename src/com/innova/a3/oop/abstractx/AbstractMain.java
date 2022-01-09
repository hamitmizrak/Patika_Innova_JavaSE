package com.innova.a3.oop.abstractx;

public class AbstractMain {
    public static void main(String[] args) {
        //Person oluşturamıyorum.
        Person person=new Teacher();
        person.setId(34);
        person.setName("Ahmet 34");
        System.out.println(person);
        person.govdeliMethod();
        person.govdelisizMethod();

        System.out.println("**************************************");

        Student student=new Student();
        student.setId(44);
        student.setName("Ahmet 44");
        System.out.println(student);
        student.govdeliMethod();
        student.govdelisizMethod();


    }
}
