package com.sapient.book.movie.service;

import com.sapient.book.movie.data.dao.Show;
import com.sapient.book.movie.repository.ShowRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ShowService {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    private ShowRepository showRepository;
    public List<Show> findMovieShows(String movieTitle, String dateString, String city) {
        List<Show> shows = (List<Show>) showRepository.findTheatresByMovieTitleAndCity(movieTitle, city);
        List<Show> movieShows = new ArrayList<>();
        for (Show show : shows) {
            //filter the shows based on movie title, DATE and city and add to movie show list
        }
        return movieShows;
    }

    public Show createMovieShow(Show show) {
        Show shows = showRepository.createMovieShow(show);
        return show;
    }

    public Show updateMovieShow(Show show) {
        Show shows = showRepository.updateMovieShow(show);
        return show;
    }

    public Show deleteMovieShow(Show show) {
        Show shows = showRepository.deleteMovieShow(show);
        return show;
    }
}
