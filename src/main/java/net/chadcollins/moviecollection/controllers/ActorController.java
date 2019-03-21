package net.chadcollins.moviecollection.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chadcollins.moviecollection.models.Actor;
import net.chadcollins.moviecollection.repositories.ActorsRepository;

@RestController
@RequestMapping("/actors")
public class ActorController {

	
	@Resource
	ActorsRepository actorsRepo;
	
	
	@GetMapping("")
	public Collection<Actor>getActors(){
		return(Collection<Actor>)actorsRepo.findAll();
	}
}
