package com.pokemon.main.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.main.entity.Pokemon;

public interface PokemonDAO extends JpaRepository<Pokemon, Integer>  {

}
