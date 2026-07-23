package com.ATID.pokedex_back_Max_Bautista_Fabian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ATID.pokedex_back_Max_Bautista_Fabian.entity.pokemon;

import java.util.UUID;

@Repository
public interface PokemonRepository extends JpaRepository<pokemon, UUID> {
    
}