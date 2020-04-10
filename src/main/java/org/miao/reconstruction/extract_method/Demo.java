package org.miao.reconstruction.extract_method;

import java.util.List;

public class Demo {
    private List<Order> orders;
    void printOwing(double previousAmount){
        printBanner();
        double outstanding = getOutstanding(previousAmount *1.2);
        printDetails(outstanding);
    }

    void printBanner() {
        System.out.println("Customer Owes");
    }

    void printDetails(double outstanding){
        System.out.println("outstangding: " + outstanding);
    }

    double getOutstanding(double initialValue){
        double result = initialValue;
        for(Order order : orders){
            result += order.getAmount();
        }
        return result;
    }
}
