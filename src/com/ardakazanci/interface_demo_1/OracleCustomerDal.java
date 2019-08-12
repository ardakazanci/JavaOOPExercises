package com.ardakazanci.interface_demo_1;

public class OracleCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Oracle ekleme işlemi gerçekleşti.");
    }

}
