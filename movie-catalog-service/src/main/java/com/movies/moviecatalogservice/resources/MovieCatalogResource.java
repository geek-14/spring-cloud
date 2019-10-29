package com.movies.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movies.moviecatalogservice.models.CatalogItem;
import com.movies.moviecatalogservice.models.Movie;
import com.movies.moviecatalogservice.models.UserRatings;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userID){
		
		UserRatings userRatings = restTemplate.getForObject("http://movie-rating-service/ratingData/users/"+userID, UserRatings.class);
		
		return userRatings.getUserRatings().stream().map(e -> {

			//new CatalogItem("si", "su", "sa")).collect(Collectors.toList());
		Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+e.getMovieId(), Movie.class);
		return new CatalogItem(movie.getTitle(), movie.getDesc(), e.getRating());
		}).collect(Collectors.toList());
		//return Collections.singletonList(new CatalogItem("blahblah", "blahblah", "blahblah"));
	}

}
