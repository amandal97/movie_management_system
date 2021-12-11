package com.amandal.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amandal.ratingdataservice.model.Rating;
import com.amandal.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/api/rating")
public class RatingController {
	
	@GetMapping("{movieId}")
	public Rating getRating(@PathVariable("movieId") long movieId) {
		return new Rating(movieId, 4);
	}
	
	@GetMapping("users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating(1, 4),
				new Rating(2, 5),
				new Rating(3, 3)
	    );
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}

}
