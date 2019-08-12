package com.ardakazanci.interface_demo_3;

public class Car implements IVehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int a) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int a) {
        this.speed = this.speed + a;
    }

    @Override
    public void applyBrakes(int a) {
        this.speed = this.speed + a;
    }
}
