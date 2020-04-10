package org.miao.reconstruction.introduce_explaining_variable;

public class Demo {
    private int quantity;
    private int itemPrice;
    double price() {
        return quantity * itemPrice - Math.max(0,quantity - 500) * itemPrice*0.05+Math.min(quantity*itemPrice*0.1,100);
    }
}
