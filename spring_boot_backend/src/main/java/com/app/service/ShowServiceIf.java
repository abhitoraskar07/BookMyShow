package com.app.service;

import java.time.LocalDateTime;

public interface ShowServiceIf {
	
	void addShowDetailsOfExistingMovie(Long movieId,LocalDateTime startTime,LocalDateTime endTime);

}
