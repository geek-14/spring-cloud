package com.movies.movieratingservice.resources;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movies.movieratingservice.models.RatingData;
import com.movies.movieratingservice.models.UserRatings;

@RestController
@RequestMapping("/ratingData")
public class RatingResource {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{movieId}")
	public RatingData getRatingData(@PathVariable("movieId")String movieId) {
		
		return new RatingData(movieId, "blahblah");
	}
	
	@RequestMapping("users/{userId}")
	public UserRatings getUserRating(@PathVariable("userId")String userId) {
		UserRatings userRatings = new UserRatings(userId, Arrays.asList(
				new RatingData("124", "blahblah"),
				new RatingData("1242", "blahblahblah")
				));
		return userRatings;
	}

}
