package com.ATID.pokedex_back_Max_Bautista_Fabian.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "pokemons")
public class pokemon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid_pokemon", updatable = false, nullable = false)
    private UUID uuid_pokemon;

    @NotBlank(message = "El nombre del Pokémon es obligatorio")
    @Column(name = "name_pokemon", nullable = false)
    private String name_pokemon;

    @NotBlank(message = "El tipo de Pokémon es obligatorio")
    @Column(name = "type_pokemon", nullable = false)
    private String type_pokemon;

    @Min(value = 1, message = "El nivel del Pokémon es obligatorio y debe ser mayor a 0")
    @Column(name = "level_pokemon", nullable = false)
    private int level_pokemon;

    @Column(name = "capture_date")
    private LocalDate captureDate;

    @ManyToOne
    @JoinColumn(name = "uuid_trainer", nullable = false)
    private trainer trainerOwner;

    public pokemon() {
    }

    public pokemon(String name_pokemon, String type_pokemon, int level_pokemon, LocalDate captureDate,
            trainer trainerOwner) {
        this.name_pokemon = name_pokemon;
        this.type_pokemon = type_pokemon;
        this.level_pokemon = level_pokemon;
        this.captureDate = captureDate;
        this.trainerOwner = trainerOwner;
    }

    public UUID getUuid_pokemon() {
        return uuid_pokemon;
    }

    public void setUuid_pokemon(UUID uuid_pokemon) {
        this.uuid_pokemon = uuid_pokemon;
    }

    public String getName_pokemon() {
        return name_pokemon;
    }

    public void setName_pokemon(String name_pokemon) {
        this.name_pokemon = name_pokemon;
    }

    public String getType_pokemon() {
        return type_pokemon;
    }

    public void setType_pokemon(String type_pokemon) {
        this.type_pokemon = type_pokemon;
    }

    public int getLevel_pokemon() {
        return level_pokemon;
    }

    public void setLevel_pokemon(int level_pokemon) {
        this.level_pokemon = level_pokemon;
    }

    public LocalDate getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(LocalDate captureDate) {
        this.captureDate = captureDate;
    }

    public trainer getTrainerOwner() {
        return trainerOwner;
    }

    public void setTrainerOwner(trainer trainerOwner) {
        this.trainerOwner = trainerOwner;
    }

    
}
