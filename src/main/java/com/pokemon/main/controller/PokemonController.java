package com.pokemon.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pokemon.main.entity.Pokemon;
import com.pokemon.main.service.PokemonService;

@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController extends PokemonService{

	RestTemplate restTemplate;

	String url = "http://pokeapi.co/api/v2/pokemon";

	@GetMapping(value = "/abilities/{pokemon}")
	public Object getAbilities(@PathVariable(value = "pokemon") String pokemonName) {
		Pokemon pokemon = this.restTemplate.getForObject(this.url + "/" + pokemonName, Pokemon.class);
		return pokemon.getAbilities();
	};
	

	@GetMapping(value = "/base-experience/{pokemon}/")
	public Object getBaseExperience(@PathVariable(value = "pokemon") String pokemonName) {
		Pokemon pokemon = this.restTemplate.getForObject(this.url + "/" + pokemonName, Pokemon.class);
		return pokemon.getBaseExperience();
	};

	@GetMapping(value = "/held-items/{pokemon}")
	public Object getHeldItems(@PathVariable(value = "pokemon") String pokemonName) {
		Pokemon pokemon = this.restTemplate.getForObject(this.url + "/" + pokemonName, Pokemon.class);
		return pokemon.getHeldItems();
	};
	
	@GetMapping(value = "/id/{pokemon}")
	public Object getId(@PathVariable(value = "pokemon") String pokemonName) {
		Pokemon pokemon = this.restTemplate.getForObject(this.url + "/" + pokemonName, Pokemon.class);
		return pokemon.getId();
	};
	
	@GetMapping(value = "/name/{pokemon}")
	public Object getName(@PathVariable(value = "pokemon") String pokemonName) {
		Pokemon pokemon = this.restTemplate.getForObject(this.url + "/" + pokemonName, Pokemon.class);
		return pokemon.getName();
	};
	
	@GetMapping(value = "/location-area-encounters/{pokemon}")
	public Object getLocationAreaEncounters(@PathVariable(value = "pokemon") String pokemonName) {
		Pokemon pokemon = this.restTemplate.getForObject(this.url + "/" + pokemonName, Pokemon.class);
		return pokemon.getLocationAreaEncounters();
	};
	
}
