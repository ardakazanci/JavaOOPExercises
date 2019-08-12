package com.ardakazanci.static_demo_1;

public class Main {

    /**
     *
     * Static metotlara Sınıf adı ile çağırılabilir.
     * New ile ulaşılamaz.
     *
     * Not : Yapıcı metotlar new lenince çalışmaktadır.
     *
     * Java'da bir class static olmaz.
     *
     */
    public static void main(String[] args) {

        Product product_1 = new Product();
        product_1.name = "Computer";
        product_1.price = 1000.0;
        product_1.id = 100;
        ProductManager productManager = new ProductManager();
        productManager.add(product_1);

    }

}
