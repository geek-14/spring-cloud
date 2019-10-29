package com.movies.movieratingservice.models;

import java.util.List;

public class UserRatings {
	
	private String userId;

	private List<RatingData> userRatings;

	public UserRatings(String userId, List<RatingData> userRatings) {
		super();
		this.userId = userId;
		this.userRatings = userRatings;
	}

	public List<RatingData> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<RatingData> userRatings) {
		this.userRatings = userRatings;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
