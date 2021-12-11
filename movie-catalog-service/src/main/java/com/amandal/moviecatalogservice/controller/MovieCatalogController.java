package com.amandal.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.amandal.moviecatalogservice.model.Movie;
import com.amandal.moviecatalogservice.model.MovieCatalog;
import com.amandal.moviecatalogservice.model.Rating;
import com.amandal.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/api/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("{userId}")
	public List<MovieCatalog> getMovieCatalog(@PathVariable("userId") String userId) {
		
		// get all rated movie IDs
		UserRating userRating = restTemplate.getForObject("http://rating-data-service/api/rating/users/" + userId, UserRating.class);
		
		
		return userRating.getUserRating().stream().map(rating -> {

			// for each movie id, call movie info service and get details
			Movie movie = restTemplate.getForObject("http://movie-info-service/api/movie/" + rating.getMovieId(), Movie.class);
			
			/* Movie movie = webClientBuilder.build()
					.get()
					.uri("http://localhost:8081/api/movie/" + rating.getMovieId())
					.retrieve()
					.bodyToMono(Movie.class)
					.block();
		    */
			
			// put them all together
			return new MovieCatalog(movie.getName(), "test", rating.getRating());
		
		}).collect(Collectors.toList());

	}

}
