package org.miao.reconstruction.inlinemethod;

public class Demo {
    private int numberOfLateDeliveries;
    int getRating() {
        return (numberOfLateDeliveries > 5) ? 2 : 1;
    }
}
