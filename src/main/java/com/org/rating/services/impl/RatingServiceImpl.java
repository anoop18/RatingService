package com.org.rating.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.rating.entites.Rating;
import com.org.rating.exceptions.ResourecNotFoundException;
import com.org.rating.repositories.RatingRepositories;
import com.org.rating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepositories ratingRepositories;

	@Override
	public Rating create(Rating rating) {
     String ratingId =  UUID.randomUUID().toString();
     rating.setRatingId(ratingId);
   return ratingRepositories.save(rating);
	}

	@Override
	public List<Rating> getAll() {
		return ratingRepositories.findAll();
	}

	@Override
	public Rating getRatingById(String id) {
		return ratingRepositories.findById(id).orElseThrow(()-> new ResourecNotFoundException("Rating with given id not found"));
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepositories.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepositories.findByHotelId(hotelId);
	}

}
