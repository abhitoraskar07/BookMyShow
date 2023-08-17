package com.app.service;

import java.util.List;

import com.app.pojo.Movie;

public interface MovieServiceIf {
   Movie addNewMovie(Movie m);
   List<Movie> getAllMovies();
}
