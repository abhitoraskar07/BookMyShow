package com.app.pojo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
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
@Table(name = "movie")
public class Movie extends BaseEntity{
   private String movieName;
   @Enumerated(EnumType.STRING)
   private MovieStatus movieStatus;
   private double rating;
   @OneToMany(mappedBy = "movieSelected",cascade = CascadeType.ALL)
   private List<ShowDetails> showList = new ArrayList<>();

   public void addShowDetails(ShowDetails sh_dtls) {
	   showList.add(sh_dtls);
	   sh_dtls.setMovieSelected(this);
   }

   public void removeShowDetails(ShowDetails sh_dtls) {
	   showList.remove(sh_dtls);
	   sh_dtls.setMovieSelected(null);
   }
}
