package com.lucas.ApiRest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.lucas.ApiRest.exception.CouldNotCreateMovieException;
import com.lucas.ApiRest.exception.EqualMovieNameException;
import com.lucas.ApiRest.model.Censorship;
import com.lucas.ApiRest.model.Movie;
import com.lucas.ApiRest.repository.RestRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController @RequestMapping(value="/api")
@Api(value="BackEnd Challenge")
@CrossOrigin(origins="*")
public class MovieResource {
	
	@Autowired
	RestRepository repo;
	
	@GetMapping("/movies")
	@ApiOperation(value="Lists movies according to censorship")
	public List<Movie> listMovies(@RequestParam Censorship censorship){
		try {
			return repo.findByCensorship(censorship);
		} catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error when listing movies by censorship level", e);
		}
		
	}

	@PostMapping("/movies")
	@ApiOperation(value="Add a movie")
	public Movie addMovie(@RequestBody Movie movie) {
		try {
			if(repo.existsByName(movie.getName()))
				throw new EqualMovieNameException(movie.getName());
			
			return repo.save(movie);
		} catch(EqualMovieNameException ee) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ee.getMessage(), ee);
		} catch(CouldNotCreateMovieException ce) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ce.getMessage(), ce);
		} catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
		}
		
	}
	
}
