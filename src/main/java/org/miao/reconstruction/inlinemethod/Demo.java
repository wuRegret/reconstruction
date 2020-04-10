package org.miao.reconstruction.inlinemethod;

public class Demo {
    private int numberOfLateDeliveries;
    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }
    boolean moreThanFiveLateDeliveries(){
        return numberOfLateDeliveries > 5;
    }
}
