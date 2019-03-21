package net.chadcollins.moviecollection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@GeneratedValue
	@Id
	private Long movieId;
	private String movieTitle;
	private String releaseDate;
	
	@ManyToMany
	private Collection<Actor>actors;
	
	public Movie() {}
	
	public Movie(String movieTitle, String releaseDate, Actor ...actors) {
		this.movieTitle = movieTitle;
		this.releaseDate = releaseDate;
		this.actors = new ArrayList<>(Arrays.asList(actors));
		
	}

	public Collection<Actor> getActors() {
		return actors;
	}

	public Long getMovieId() {
		return movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	
	

}
