package com.movies.moviecatalogservice.models;

public class Movie {
	
	private String movieId;
	
	private String title;
	
	private String desc;
	
	public Movie() {
		
	}

	public Movie(String movieId, String title) {
		super();
		this.movieId = movieId;
		this.title = title;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
