package org.miao.reconstruction.chapter1;


import java.util.ArrayList;

import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name){
        this.name = name;
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }

    public String getName(){
        return name;
    }

    public String statement(){
        int frequentRenterPoints =0;
        String result ="Rental Record for " + getName()+"\n";
        for (Rental rental : rentals){
            frequentRenterPoints+=rental.getFrequentRenterPoints();
            //显示此租金的数字
            result += "\t"+ rental.getMovie().getTitle()+"\t"+rental.getCharge() + "\n";
        }
        //增加尾行
        result +="Amount owed is·"+getTotalCharge()+"\n°";
        result +="You earned "+getTotalFrequentRenterPoints()+"frequent renter points";
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        for (Rental rental:rentals){
            result += rental.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental:rentals){
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

}
