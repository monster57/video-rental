package com.twu.refactor;

public class Movie {

    private String title;
	private MoviePricingCategory priceCode;

	public Movie(String title, MoviePricingCategory priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public MoviePricingCategory getCostForMovie() {
		return priceCode;
	}

	public void setPriceCode(MoviePricingCategory arg) {
    	priceCode = arg;
	}

	public String getTitle () {
		return title;
	}

    public boolean isNewRelease() {
        return getCostForMovie() == MoviePricingCategory.NEW_RELEASE;
    }

    public double getAmountFor(Rental rental) {
        MoviePricingCategory priceCode = getCostForMovie();
        return priceCode.getCostFor(rental.daysRented);
    }

    public int getFrequentRenterPoints(Rental rental) {
        int frequentRenterPoints = 1;
        if (isNewRelease() && rental.daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}

