package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Review;
import com.balatsch.shoppingCart.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImp implements ReviewService{
    @Autowired
    ReviewRepository reviewRepository;

    // only for user but not admin , admin can update but cannot create
    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Review review) {
        reviewRepository.delete(review);
    }

    @Override
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }
}
