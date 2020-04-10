package org.miao.reconstruction.chapter6.replace_method_with_method_object;

public class Gamma {
    private Account account;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;
    private int inputVal;
    private int quantity;
    private int yearToDate;

    Gamma(Account account,int input, int quantity, int yearToDate){
        this.account = account;
        this.inputVal = input;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        importantValue1 = (inputVal*quantity) + delta();
        importantValue2 = (inputVal*yearToDate) + 100;
        importantThing();
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }

    int delta(){
        return 0;
    }

    void importantThing() {
        if (yearToDate - importantValue1 > 100)
            importantValue2 -= 20;
    }
}
