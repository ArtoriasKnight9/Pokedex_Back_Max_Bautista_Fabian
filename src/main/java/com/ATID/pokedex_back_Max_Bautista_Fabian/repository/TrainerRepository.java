package com.ATID.pokedex_back_Max_Bautista_Fabian.repository;

import com.ATID.pokedex_back_Max_Bautista_Fabian.entities.trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TrainerRepository extends JpaRepository<trainer, UUID> {
}