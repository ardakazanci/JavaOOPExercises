package com.ardakazanci.interface_demo_1;

/**
 * Interface aracılığıyla veritabanı ile alakalı ortak operasyona ulaştık.
 */
public class MysqlCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Mysql ekleme işlemi gerçekleşti.");
    }

}
