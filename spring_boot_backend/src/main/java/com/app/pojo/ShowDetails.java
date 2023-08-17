package com.app.pojo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "show_details")
public class ShowDetails extends BaseEntity {
   private LocalDateTime startTime;
   private LocalDateTime endTime;
   @ManyToOne
   @JoinColumn(name = "movie_id")
   private Movie movieSelected; 
}
