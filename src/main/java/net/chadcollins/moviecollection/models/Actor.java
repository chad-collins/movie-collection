package net.chadcollins.moviecollection.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {

	
	@Id
	@GeneratedValue
	private Long actorId;
	private String actorName;
	
	@ManyToMany(mappedBy="actors")
	private Collection<Movie>movies;
	
	public Actor() {}
	
	public Actor(String actorName) {
		this.actorName = actorName; 
		
	}
	
	public Collection<Movie> getMovies() {
		return movies;
	}

	public Long getActorId() {
		return actorId;
	}
	public String getActorName() {
		return actorName;
	}
	
	
}
