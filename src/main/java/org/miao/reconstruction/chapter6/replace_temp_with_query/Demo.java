package org.miao.reconstruction.chapter6.replace_temp_with_query;

public class Demo {
    private int quantity;
    private int itemPrice;
    double getPrice() {
        return basePrice() * discountFactor();
    }

    private int basePrice(){
        return quantity * itemPrice;
    }

    private double discountFactor(){
        if (basePrice() > 1000) return 0.95;
        return 0.98;
    }
}
