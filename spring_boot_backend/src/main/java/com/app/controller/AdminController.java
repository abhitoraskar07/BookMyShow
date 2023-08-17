package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Movie;
import com.app.service.MovieService;
import com.app.service.MovieServiceIf;

@RestController
@RequestMapping("/admin")
public class AdminController{
   
	@Autowired
	MovieServiceIf movieService;
	
	@GetMapping
	public List<Movie> getMovies(){
		return movieService.getAllMovies();
	}
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		System.out.println("in addMovieController....");
		return movieService.addNewMovie(movie);
	}
	
}
