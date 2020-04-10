package org.miao.reconstruction.remove_assign_to_param;

public class Demo {
    int discount(int inputVal, int quantity, int yearToDate){
        int result = inputVal;
        if (inputVal > 50 ) result -= 2;
        if (quantity > 100 ) result -= 1;
        if (yearToDate > 10000) result -= 4;
        return result;
    }
}
