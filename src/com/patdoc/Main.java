package com.patdoc;

public class Main {

    public static void main(String[] args) {

        Bugatti bugatti = new Bugatti("Veyron");
        Ferrari ferrari = new Ferrari("Testarossa");
        AstonMartin astonMartin = new AstonMartin("DB9");

        System.out.println(bugatti.brake());
        System.out.println(ferrari.brake());
        System.out.println(astonMartin.brake());
        System.out.println(bugatti.accelerate());
        System.out.println(ferrari.accelerate());
        System.out.println(astonMartin.accelerate());
        System.out.println(bugatti.startEngine());
        System.out.println(ferrari.startEngine());
        System.out.println(astonMartin.startEngine());



    }


}
