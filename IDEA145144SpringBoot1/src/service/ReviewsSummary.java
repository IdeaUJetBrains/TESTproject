package service;


import domain.Rating;

public interface ReviewsSummary {

    long getNumberOfReviewsWithRating(Rating rating);

}
