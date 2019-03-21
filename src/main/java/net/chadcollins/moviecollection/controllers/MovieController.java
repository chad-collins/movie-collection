package net.chadcollins.moviecollection.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chadcollins.moviecollection.models.Movie;
import net.chadcollins.moviecollection.repositories.MoviesRepository;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Resource
	MoviesRepository moviesRepo;
	
	
	@GetMapping("")
	public Collection<Movie>getMovies(){
		return (Collection<Movie>)moviesRepo.findAll();
		
	}
}
