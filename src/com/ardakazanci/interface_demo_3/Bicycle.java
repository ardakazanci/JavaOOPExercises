package com.ardakazanci.interface_demo_3;

public class Bicycle implements IVehicle {

    int gear;
    int speed;

    @Override
    public void changeGear(int a) {

        this.gear = a;

    }

    @Override
    public void speedUp(int a) {

        this.speed = this.speed + a;

    }

    @Override
    public void applyBrakes(int a) {

        this.speed = this.speed - a;

    }


}
