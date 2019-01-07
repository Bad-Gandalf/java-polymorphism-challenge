package com.patdoc;

public class AstonMartin extends Car {
    private String name;
    private static final String MANUFACTURER = "Aston Martin";

    public AstonMartin(String name) {
        super("3L Sweety", 8, true);
        this.name = name;
    }

    @Override
    public String brake() {
        return "Its good to brake now and again, you dont want to die inside " +
                "your " + this.MANUFACTURER + " " + this.name;
    }
}
