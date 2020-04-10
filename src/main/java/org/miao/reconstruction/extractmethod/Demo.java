package org.miao.reconstruction.extractmethod;

import java.util.List;

public class Demo {
    private List<Order> orders;
    void printOwing(){
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    void printBanner() {
        System.out.println("Customer Owes");
    }

    void printDetails(double outstanding){
        System.out.println("outstangding: " + outstanding);
    }

    double getOutstanding(){
        double result = 0.0;
        for(Order order : orders){
            result += order.getAmount();
        }
        return result;
    }
}
