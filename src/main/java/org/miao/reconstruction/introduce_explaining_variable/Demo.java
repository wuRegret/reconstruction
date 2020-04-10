package org.miao.reconstruction.introduce_explaining_variable;

public class Demo {
    private double quantity;
    private double itemPrice;
    double price() {
        return  basePrice()- quantityDiscount() + shipping();
    }

    double basePrice(){
        return quantity * itemPrice;
    }

    double quantityDiscount(){
        return Math.max(0,quantity - 500) * itemPrice*0.05;
    }

    double shipping(){
        return Math.min(basePrice()*0.1,100);
    }

}
