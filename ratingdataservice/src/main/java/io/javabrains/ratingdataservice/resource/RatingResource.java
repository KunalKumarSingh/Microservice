package io.javabrains.ratingdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingdataservice.model.Rating;
import io.javabrains.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/movies/{movieid}")
    public Rating getMovieRating(@PathVariable("movieid") String movieid) {
        return new Rating(movieid, 4);
    }

	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) 
	{ 
		UserRating userRating= new UserRating(); 
		userRating.initData(userId); 
		return userRating;
	  
	}
	 

}
