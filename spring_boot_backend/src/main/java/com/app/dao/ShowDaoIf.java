package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.ShowDetails;

public interface ShowDaoIf extends JpaRepository<ShowDetails, Long> {

}
