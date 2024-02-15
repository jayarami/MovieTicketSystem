package com.sapient.book.movie.data.dao;

import javax.persistence.*;

@Entity
@Table
public class Theatre {
    @Id
    @Column(name = "THEATRE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "THEATRE_NAME")
    private String tName;
    @Column(name = "THEATRE_CITY")
    private String tCity;
}
