package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Movie;

public interface MovieDaoIf extends JpaRepository<Movie, Long>{
   
}
