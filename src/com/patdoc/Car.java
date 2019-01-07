package com.patdoc;

public class Car {

    private String engine;
    private int cylinders;
    private static final int wheels = 4;
    private boolean hasSunroof;

    public Car(String engine, int cylinders, boolean hasSunroof) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.hasSunroof = hasSunroof;
    }
    public String accelerate(){
        return "Your are now accelerating, brrmm brmm brmm";
    }

    public String startEngine(){
        return "Your car's engine has been started";
    }

    public String brake(){
        return "Your car's brakes have been engaged and you are slowing down.";
    }


    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }
}
