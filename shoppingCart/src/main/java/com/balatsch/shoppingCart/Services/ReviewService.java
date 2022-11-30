package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Review;

import java.util.List;

public interface ReviewService {
    public Review createReview(Review review);
    public void deleteReview(Review review);
    public List<Review> getReviews();
}
