package org.miao.reconstruction.replace_temp_with_query;

public class Demo {
    private int quantity;
    private int itemPrice;
    double getPrice() {
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) discountFactor =0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }
}
