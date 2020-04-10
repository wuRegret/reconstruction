package org.miao.reconstruction.extractmethod;

import java.util.List;

public class Demo {
    private List<Order> orders;
    void printOwing(){
        double outstanding = 0.0;
        System.out.println("Customer Owes");
        for(Order order : orders){
            outstanding += order.getAmount();
        }
        System.out.println("outstangding: " + outstanding);
    }
}
