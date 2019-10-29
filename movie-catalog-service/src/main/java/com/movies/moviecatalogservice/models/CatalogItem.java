package com.movies.moviecatalogservice.models;

public class CatalogItem {
	
	private String title;
	
	private String desc;
	
	private String rating;

	public CatalogItem(String title, String desc, String rating) {
		super();
		this.title = title;
		this.desc = desc;
		this.rating = rating;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
