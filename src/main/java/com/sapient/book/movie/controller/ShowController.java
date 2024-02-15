package com.sapient.book.movie.controller;

import com.sapient.book.movie.data.dao.Show;
import com.sapient.book.movie.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/shows")
@Slf4j
public class ShowController {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    @Autowired
    private ShowService showService;
    @GetMapping("/{movieTitle}/{date}/{city}")
    public List<Show> getMovieShows(
            @PathVariable(value = "movieTitle") String movieName,
            @PathVariable(value = "date") String dateString,
            @PathVariable(value = "city") String city) {
        return showService.findMovieShows(movieName, dateString, city);
    }
    @PostMapping
    public Show createMovieShow(@RequestBody Show show) {
        return showService.createMovieShow(show);
    }
    @PutMapping
    public Show updateMovieShow(@RequestBody Show show) {
        return showService.updateMovieShow(show);
    }
    @DeleteMapping
    public Show deleteMovieShow(@RequestBody Show show) {
        return showService.deleteMovieShow(show);
    }
}
