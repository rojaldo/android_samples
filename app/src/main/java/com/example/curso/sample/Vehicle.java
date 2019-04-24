package com.example.curso.sample;

class Vehicle {

    Speed speed;
    int range;

    public Vehicle(Speed speed, int range) {
        this.speed = speed;
        this.range = range;
    }

    public Vehicle() {
    }

    void move(Speed mySpeed){
        this.speed = mySpeed;
    }
}
