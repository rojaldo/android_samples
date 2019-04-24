package com.example.curso.sample;

public class Car extends Vehicle {
    String brand;
    String model;
    boolean carOn = false;

    public Car(Speed speed, String model, int range, String brand) {
        super(speed, range);
        this.brand = brand;
        this.model = model;
    }

    void moveCar(Speed speed){
        super.move(speed);
    }

    @Override
    void move(Speed speed){
        this.speed = speed;
    }

    boolean switchOn(){
        this.carOn = true;
        return true;
    }

    boolean switchOff(){
        this.carOn = false;
        return true;
    }

}
