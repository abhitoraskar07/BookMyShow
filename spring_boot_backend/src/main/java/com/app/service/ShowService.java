package com.app.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.custom_exception.CustomException;
import com.app.dao.MovieDaoIf;
import com.app.dao.ShowDaoIf;
import com.app.pojo.Movie;
import com.app.pojo.ShowDetails;

public class ShowService implements ShowServiceIf {

	@Autowired
	private ShowDaoIf showDao;
	
	@Autowired
	private MovieDaoIf movieDao;
	
	@Override
	public void addShowDetailsOfExistingMovie(Long movieId,LocalDateTime startTime,LocalDateTime endTime) {
	  
	System.out.println("in Show service... adding show details");
	  Movie movie = movieDao.findById(movieId).orElseThrow(()->new CustomException("movieId not valid...!!"));
	  ShowDetails sh_dtls=new ShowDetails(startTime,endTime,movie);
	  showDao.save(sh_dtls);
	  movie.addShowDetails(sh_dtls);
	}

}
