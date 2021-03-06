package service;

import domain.Hotel;
import domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

interface ReviewRepository extends Repository<Review, Long> {

    Page<Review> findByHotel(Hotel hotel, Pageable pageable);

    Review findByHotelAndIndex(Hotel hotel, int index);

    Review save(Review review);

}