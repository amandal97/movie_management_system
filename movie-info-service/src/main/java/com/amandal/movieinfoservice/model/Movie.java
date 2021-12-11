package com.amandal.movieinfoservice.model;

public class Movie {
	
	private long movieId;
	private String name;
	
	public Movie(long movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}

	public long getMovieId() {
		return movieId;
	}

	public String getName() {
		return name;
	}

}
