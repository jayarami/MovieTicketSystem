package com.sapient.book.movie.repository;

import com.sapient.book.movie.data.dao.Show;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShowRepository extends CrudRepository<Show, Integer> {
    List<Show> findTheatresByMovieTitleAndCity(String movieTitle, String city);
    Show deleteMovieShow(Show show);
    Show updateMovieShow(Show show);
    Show createMovieShow(Show show);
}
