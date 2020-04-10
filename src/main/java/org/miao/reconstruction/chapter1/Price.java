package org.miao.reconstruction.chapter1;

public interface Price {
    int getPriceCode();
    double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented);
}
