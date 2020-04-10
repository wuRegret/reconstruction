package org.miao.reconstruction.chapter6.inline_method;

public class Demo {
    private int numberOfLateDeliveries;
    int getRating() {
        return (numberOfLateDeliveries > 5) ? 2 : 1;
    }
}
