package com.pokemon.main.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pokemon.main.entity.Pokemon;

@Service
public class PokemonService {
    @Autowired
    RestTemplate restTemplate;
    public List<Pokemon> getPokemons(){
        ResponseEntity<Pokemon[]> response =
                  restTemplate.getForEntity(
                  "http://pokeapi.co/api/v2/pokemon",
                  Pokemon[].class);
                Pokemon[] pokemons = response.getBody();
                List<Pokemon> m = Arrays.asList(pokemons);
        return  m;
    }
}