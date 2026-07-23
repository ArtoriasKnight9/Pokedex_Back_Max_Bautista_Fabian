package com.ATID.pokedex_back_Max_Bautista_Fabian.service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ATID.pokedex_back_Max_Bautista_Fabian.entity.pokemon;
import com.ATID.pokedex_back_Max_Bautista_Fabian.repository.PokemonRepository;
import java.util.List;
import java.util.UUID;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    public List<pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    public pokemon registerPokemon(pokemon newPokemon) {
        return pokemonRepository.save(newPokemon);
    }

    public pokemon editPokemonlevel(UUID uuid_pokemon, int newLevel) {
        pokemon existingPokemon = pokemonRepository.findById(uuid_pokemon)
                .orElseThrow(() -> new RuntimeException("Pokemon no encontrado"));
        existingPokemon.setLevel_pokemon(newLevel);
        return pokemonRepository.save(existingPokemon);
    }

    public void deletePokemon(UUID uuid_pokemon) {
        pokemonRepository.deleteById(uuid_pokemon);
    }

}
