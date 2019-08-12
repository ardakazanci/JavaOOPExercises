package com.ardakazanci.static_demo_1;

public class ProductManager {

    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }

    }

}
