package org.miao.reconstruction.extractmethod;

import java.util.List;

public class Demo {
    private List<Order> orders;
    void printOwing(){
        double outstanding = 0.0;
        printBanner();
        for(Order order : orders){
            outstanding += order.getAmount();
        }
        System.out.println("outstangding: " + outstanding);
    }

    void printBanner() {
        System.out.println("Customer Owes");
    }
}
