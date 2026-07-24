package com.ATID.pokedex_back_Max_Bautista_Fabian.controller;

import com.ATID.pokedex_back_Max_Bautista_Fabian.entities.trainer;
import com.ATID.pokedex_back_Max_Bautista_Fabian.service.TrainerService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trainers")
@CrossOrigin(origins = "*")
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<trainer> getAllTrainers() {
        return trainerService.getAllTrainers();
    }
}