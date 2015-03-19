package com.twu.refactor;

public class Rental {

    Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getAmountFor() {
        return movie.getPriceCode().getCostFor(daysRented);
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;
        if (movie.isNewRelease() && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

}