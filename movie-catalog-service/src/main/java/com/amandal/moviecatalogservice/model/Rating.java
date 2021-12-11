package com.amandal.moviecatalogservice.model;

public class Rating {
	private long movieId;
	private int rating;
	
	public Rating() {
		
	}
	
	public Rating(long movieId, int rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
