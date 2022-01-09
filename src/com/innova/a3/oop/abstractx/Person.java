package com.innova.a3.oop.abstractx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
  abstract public  class Person {
    private int id;
    private String name;

    //gövdeli metot
    public void govdeliMethod(){
        System.out.println("Gövdeli method");
    }

    //gövdesiz metot
    abstract   public void govdelisizMethod();

}
