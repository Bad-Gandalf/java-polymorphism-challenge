package com.patdoc;

public class Bugatti extends Car {

    private static final String MANUFACTURER = "Bugatti";
    private String name;

    public Bugatti(String name) {
        super("8L Death Machine", 20, true);
        this.name = name;
    }

    @Override
    public String accelerate() {
        return "This " + this.MANUFACTURER + " " + this.name
                + " can do 250mph. You are going to kill yourself!";
    }
}
