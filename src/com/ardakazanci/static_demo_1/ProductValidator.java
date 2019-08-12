package com.ardakazanci.static_demo_1;

public class ProductValidator {
    /**
     * Araç amacıyla kullanılacak yapılarda static kullanmak mantıklıdır.
     */
    /**
     * New lenmeden çalışmaktadır. Fakat önerilmemektedir.
     */
    static {
        System.out.println("Örnek static blok");
    }

    public static boolean isValid(Product product) {

        if (product.price > 0 && !product.name.isEmpty()) {

            return true;

        } else {

            return false;

        }

    }

}
