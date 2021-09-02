package io.javabrains.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieid}")
	public Movie getMovieInfo(@PathVariable("movieid") String movieid) {
		return new Movie(movieid, "Test Movie Name");
	}

}
