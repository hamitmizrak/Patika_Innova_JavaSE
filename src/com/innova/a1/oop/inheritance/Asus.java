package com.innova.a1.oop.inheritance;

public class Asus extends Computer {

    private String asusPrimary;

    //paramtresiz constructor
    public Asus() {
    }

    //parametreli constructor
    public Asus(int computerId, String computerRam, String asusPrimary) {
        super(computerId, computerRam);
        this.asusPrimary = asusPrimary;
    }

    //toString
    @Override
    public String toString() {
        return "Asus{" +
                "asusPrimary='" + asusPrimary + '\'' +
                "} " + super.toString();
    }

    @Override
    public void inheritanceMethod() {
        super.inheritanceMethod();
        System.out.println("Asus override");
    }

    //getter and setter
    public String getAsusPrimary() {
        return asusPrimary;
    }

    public Asus setAsusPrimary(String asusPrimary) {
        this.asusPrimary = asusPrimary;
        return this;
    }
}
