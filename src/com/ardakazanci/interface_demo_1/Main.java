package com.ardakazanci.interface_demo_1;

public class Main {

    public static void main(String[] args) {

        /**
         * Interface'ler Abstractlar gibi new lenemez.
         * Burada ki konsept Strateji Pattern'dir.
         */
        CustomerManager customer_1 = new CustomerManager(new MysqlCustomerDal());
        CustomerManager customer_2 = new CustomerManager(new OracleCustomerDal());


    }
}
