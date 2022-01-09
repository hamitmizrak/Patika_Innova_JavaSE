package com.innova.a1.oop.bean;

public class BeanMainTest {

    public static void main(String[] args) {
        _A2_Bean_Lombok bean=new _A2_Bean_Lombok();
        bean.setStudentName("Mehmet");
        System.out.println(bean.getStudentName());
        //System.out.println(bean);
        System.out.println(bean.hashCode());
        String staticKey=   StaticTutorials.URL;
    }
}
