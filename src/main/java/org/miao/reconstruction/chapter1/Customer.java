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
        double totalAmount =0;
        int frequentRenterPoints =0;
        String result ="Rental Record for " + getName()+"\n";
        for (Rental rental : rentals){
            double thisAmount =0;
            //确定每一行的金额
            switch (rental.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (rental.getDaysRentend()>2)
                        thisAmount +=(rental.getDaysRentend()-2)*1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += rental.getDaysRentend()*3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (rental.getDaysRentend()>3)
                        thisAmount +=(rental.getDaysRentend()-3)*1.5;
                    break;
            }
            //增加常客点
            frequentRenterPoints++;
            //为新发布的两天租金增加奖金
            if((rental.getMovie().getPriceCode()== Movie.NEW_RELEASE)&
                    rental.getDaysRentend()>1)
                frequentRenterPoints++;
            //显示此租金的数字
            result += "\t"+ rental.getMovie().getTitle()+"\t"+thisAmount + "\n";
            totalAmount += totalAmount;
        }
        //增加尾行
        result +="Amount owed is·"+totalAmount+"\n°";
        result +="You earned "+frequentRenterPoints+"frequent renter points";
        return result;
    }
}
