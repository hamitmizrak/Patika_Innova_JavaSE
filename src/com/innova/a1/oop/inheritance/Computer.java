package com.innova.a1.oop.inheritance;
//inheritance: nJava single inheritance
//genel ortak özellikleri almak için kullanıyoruz.

//bütün bilgisayardaki genel özellikler
public class Computer {
//nesne değişkenleriz
    private int computerId;
    private String computerRam;

    public Computer() {
    }
//prametresiz constructor:
    public Computer(int computerId, String computerRam) {
        this.computerId = computerId;
        this.computerRam = computerRam;
    }

    //toString
    @Override
    public String toString() {
        return "Computer{" +
                "computerId=" + computerId +
                ", computerRam='" + computerRam + '\'' +
                '}';
    }

    public void inheritanceMethod(){
        System.out.println("Merhabalar inheritance");
    }


//getter and setter
    public int getComputerId() {
        return computerId;
    }

    public Computer setComputerId(int computerId) {
        this.computerId = computerId;
        return this;
    }

    public String getComputerRam() {
        return computerRam;
    }

    public Computer setComputerRam(String computerRam) {
        this.computerRam = computerRam;
        return this;
    }
}
