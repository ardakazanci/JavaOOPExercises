package com.ardakazanci.interface_demo_2;

/**
 * Bizim çalışanımız.
 */
public class Worker implements IWorkable,IEatable,IPayable {

    @Override
    public void work() {

    }

    /**
     * Sadece kendi personelimize yemek veriyoruz.
     */
    @Override
    public void eat() {

    }

    @Override
    public void pay() {

    }
}
