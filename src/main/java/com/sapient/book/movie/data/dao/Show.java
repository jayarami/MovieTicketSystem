package com.sapient.book.movie.data.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Show {
    @Id
    @Column(name = "SHOW_ID")
    private String showId;
    @Column(name = "MOVIE_TITLE")
    private String movieTitle;
    @Column(name = "THEATRE_ID")
    private long theatreId;
    private String theatreName;
    private String city;
    private String screeningDate;
    private String screeningTime;
    private int numOfSeats;
}
