package com.patdoc;

public class Ferrari extends Car {
    private String name;
    private static final String MANUFACTURER = "Ferrari";

    public Ferrari(String name) {
        super("6L Beast", 16,  true);

        this.name = name;

    }

    @Override
    public String startEngine() {
        return "Your " + this.MANUFACTURER + " " + this.name
                + " isa ready fora you";
    }
}
