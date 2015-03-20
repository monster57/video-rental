package com.twu.refactor;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private ArrayList<Rental> rentalList = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentalList) {
            totalAmount += rental.movie.getAmountFor(rental);
        }
        return totalAmount;
    }

    public int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentalList) {
            frequentRenterPoints += rental.movie.getFrequentRenterPoints(rental);
        }
        return frequentRenterPoints;
    }

    public void addRental(Rental arg) {
        rentalList.add(arg);
    }

    public String getName() {
        return name;
    }

    public String getRentalSubTotal(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t"
                + String.valueOf(rental.movie.getAmountFor(rental)) + "\n";
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    //    public String htmlStatement () {
//
//        String result = new StringBuilder().append("<H1>Rental Record for <EM>").append(getName()).append("</EM></H1>").append();
//
//        return result;
//    }
}
