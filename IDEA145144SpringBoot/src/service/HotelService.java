package service;

import domain.City;
import domain.Hotel;
import domain.Review;
import domain.ReviewDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HotelService {

    Hotel getHotel(City city, String name);

    Page<Review> getReviews(Hotel hotel, Pageable pageable);

    Review getReview(Hotel hotel, int index);

    Review addReview(Hotel hotel, ReviewDetails details);

    ReviewsSummary getReviewSummary(Hotel hotel);

}