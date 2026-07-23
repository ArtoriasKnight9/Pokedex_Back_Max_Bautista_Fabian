package com.ATID.pokedex_back_Max_Bautista_Fabian.controller;


import com.ATID.pokedex_back_Max_Bautista_Fabian.entities.pokemon;
import com.ATID.pokedex_back_Max_Bautista_Fabian.service.PokemonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<pokemon> getAllPokemons() {
        return pokemonService.getAllPokemons();
    }

    @PostMapping
    public pokemon registerPokemon(@Valid @RequestBody pokemon newPokemon) {
        return pokemonService.registerPokemon(newPokemon);
    }

    @PatchMapping("/{uuid_pokemon}/level")
    public pokemon editPokemonLevel(@PathVariable UUID uuid_pokemon, @RequestParam int newLevel) {
        return pokemonService.editPokemonlevel(uuid_pokemon, newLevel);
    }

    @DeleteMapping("/{uuid_pokemon}")
    public void deletePokemon(@PathVariable UUID uuid_pokemon) {
        pokemonService.deletePokemon(uuid_pokemon);
    }
}
