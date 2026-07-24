package com.ATID.pokedex_back_Max_Bautista_Fabian.service;

import com.ATID.pokedex_back_Max_Bautista_Fabian.entities.trainer;
import com.ATID.pokedex_back_Max_Bautista_Fabian.repository.TrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public List<trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }
}