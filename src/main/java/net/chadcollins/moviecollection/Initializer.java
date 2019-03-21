package net.chadcollins.moviecollection;
import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import net.chadcollins.moviecollection.models.Actor;
import net.chadcollins.moviecollection.models.Movie;
import net.chadcollins.moviecollection.repositories.ActorsRepository;
import net.chadcollins.moviecollection.repositories.MoviesRepository;



@Service
public class Initializer implements CommandLineRunner {

	@Resource
	MoviesRepository moviesRepo;
	@Resource
	ActorsRepository actorsRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Actor robert =actorsRepository.save(new Actor("Robert Downey Jr."));
		Actor chris =actorsRepository.save(new Actor("Chris Pratt"));
		Actor tom =actorsRepository.save(new Actor("Tom Hiddleson"));
		
		moviesRepo.save(new Movie("The Avengers", "date", tom, chris, robert));
		moviesRepo.save(new Movie("The Avengers: Infinity War", "date", tom, chris, robert));
		
		
		
		

}

}



