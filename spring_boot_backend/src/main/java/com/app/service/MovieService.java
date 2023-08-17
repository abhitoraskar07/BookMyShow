package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.MovieDaoIf;
import com.app.pojo.Movie;

@Service
@Transactional
public class MovieService implements MovieServiceIf {

	@Autowired
	private MovieDaoIf movieDao;
	
	@Override
	public Movie addNewMovie(Movie m) {
		System.out.println("in movie service layer... adding movie");
		return movieDao.save(m);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieDao.findAll();
	}

}
