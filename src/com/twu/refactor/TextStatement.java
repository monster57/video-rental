package com.twu.refactor;

import java.util.List;
public class TextStatement {
    public static String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    public static String getFooterLines(double totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return result;
    }

    public String statement(List<Rental> rentalList, Customer customer) {
        String result = getHeader(customer);
        for (Rental rental : rentalList) {
            result += customer.getRentalSubTotal(rental);
        }
        result += getFooterLines(customer.totalAmount(), customer.getTotalFrequentRenterPoints());
        return result;
    }
}
