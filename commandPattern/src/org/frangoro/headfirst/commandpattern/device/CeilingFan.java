package org.frangoro.headfirst.commandpattern.device;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Turn the fan speed to high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Turn the fan speed to medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Turn the fan speed to low");
    }

    public void off() {
        speed = OFF;
        System.out.println("Turn the fan speed to off");
    }

    public int getSpeed(){return speed;}
}
