package com.amandal.movieinfoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amandal.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/api/movie")
public class MovieInfoController {
	
	@GetMapping("{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") long movieId) {
		return new Movie(movieId, "Inception");
	}

}
