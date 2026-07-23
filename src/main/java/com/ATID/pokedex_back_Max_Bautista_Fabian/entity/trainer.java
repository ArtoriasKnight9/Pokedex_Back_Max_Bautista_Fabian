package com.ATID.pokedex_back_Max_Bautista_Fabian.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import jakarta.validation.constraints.NotBlank;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "trainers")
public class trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid_trainer", updatable = false, nullable = false)
    private UUID uuid_trainer;

    @NotBlank(message = "El nombre del entrenador es obligatorio")
    @Column(name = "name_trainer", nullable = false)
    private String name_trainer;

    @NotBlank(message = "La edad del entrenador es obligatoria")
    @Column(name = "age_trainer", nullable = false)
    private int age_trainer;

    @NotBlank(message = "El género del entrenador es obligatorio")
    @Column(name = "gender_trainer", nullable = false)
    private String gender_trainer;

    @NotBlank(message = "La región del entrenador es obligatoria")
    @Column(name = "region_trainer", nullable = false)
    private String region_trainer;

    @Column(name = "number_of_pokemons", nullable = false)
    private int number_of_pokemons;

    public trainer() {
    }

    public trainer(String name_trainer, int age_trainer, String gender_trainer, String region_trainer,
            int number_of_pokemons) {
        this.name_trainer = name_trainer;
        this.age_trainer = age_trainer;
        this.gender_trainer = gender_trainer;
        this.region_trainer = region_trainer;
        this.number_of_pokemons = number_of_pokemons;
    }

    public UUID getUuid_trainer() {
        return uuid_trainer;
    }

    public void setUuid_trainer(UUID uuid_trainer) {
        this.uuid_trainer = uuid_trainer;
    }

    public String getName_trainer() {
        return name_trainer;
    }

    public void setName_trainer(String name_trainer) {
        this.name_trainer = name_trainer;
    }

    public int getAge_trainer() {
        return age_trainer;
    }

    public void setAge_trainer(int age_trainer) {
        this.age_trainer = age_trainer;
    }

    public String getGender_trainer() {
        return gender_trainer;
    }

    public void setGender_trainer(String gender_trainer) {
        this.gender_trainer = gender_trainer;
    }

    public String getRegion_trainer() {
        return region_trainer;
    }

    public void setRegion_trainer(String region_trainer) {
        this.region_trainer = region_trainer;
    }

    public int getNumber_of_pokemons() {
        return number_of_pokemons;
    }

    public void setNumber_of_pokemons(int number_of_pokemons) {
        this.number_of_pokemons = number_of_pokemons;
    }

}