package net.chadcollins.moviecollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.chadcollins.moviecollection.models.Actor;

@Repository
public interface ActorsRepository extends CrudRepository<Actor, Long>{

	
	
	
}
