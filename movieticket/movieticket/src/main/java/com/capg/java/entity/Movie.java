package com.capg.java.entity;

import java.time.LocalDate;

//import antlr.collections.List;

public class Movie {
	private int movieId;
	private String movieName;
	private Show movieGenre;
	private LocalDate movieDirector;
	private int movieLength;
	private String languages;
	private LocalDate movieReleaseDate;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, Show movieGenre, LocalDate movieDirector, int movieLength,
			String languages, LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Show getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(Show movieGenre) {
		this.movieGenre = movieGenre;
	}
	public LocalDate getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(LocalDate movieDirector) {
		this.movieDirector = movieDirector;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieLength=" + movieLength
				+ ", languages=" + languages + "]";
	}
	
	
	

}
