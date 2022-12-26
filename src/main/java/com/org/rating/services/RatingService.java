package com.org.rating.services;

import java.util.List;

import com.org.rating.entites.Rating;

public interface RatingService {
	
	Rating create(Rating rating);
	
	List<Rating> getAll();
	
	Rating getRatingById(String id);
	
	List<Rating> getRatingByUserId(String userId);
	
	List<Rating> getRatingByHotelId(String hotelId);

}
