package net.chadcollins.moviecollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.chadcollins.moviecollection.models.Movie;

@Repository
public interface MoviesRepository extends CrudRepository<Movie, Long> {

}
