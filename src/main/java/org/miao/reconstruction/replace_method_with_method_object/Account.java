package org.miao.reconstruction.replace_method_with_method_object;

public class Account {
    int gamma (int inputVal, int quantity,int yearToDate) {
        return new Gamma(this,inputVal,quantity,yearToDate).compute();
    }

}
