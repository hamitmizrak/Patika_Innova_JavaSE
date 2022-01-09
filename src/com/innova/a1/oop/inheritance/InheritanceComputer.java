package com.innova.a1.oop.inheritance;

public class InheritanceComputer {

    public static void main(String[] args) {
        
        try {
            Msi msi =new Msi();
            msi.setComputerRam("Xlh78");
            msi.setComputerId(4);
            System.out.println(msi);
            msi.inheritanceMethod();
            System.out.println("********************************");

            Asus asus =new Asus();
            asus.setComputerId(55);
            asus.setComputerRam("Asus Ram 48585");
            asus.setAsusPrimary("special Asus property");
            System.out.println(asus);
            asus.inheritanceMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        


                
    }
}
