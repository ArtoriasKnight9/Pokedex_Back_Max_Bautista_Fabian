-- 1. Creación de la tabla Entrenadores
CREATE TABLE trainers (
    uuid_trainer UUID PRIMARY KEY,
    name_trainer VARCHAR(20) NOT NULL,
    age_trainer INT NOT NULL,
    gender_trainer VARCHAR(50) NOT NULL,
    region_trainer VARCHAR(50) NOT NULL,
    number_of_pokemons INT NOT NULL
);

-- 2. Creación de la tabla Pokemons
CREATE TABLE pokemons (
    uuid_pokemon UUID PRIMARY KEY,
    name_pokemon VARCHAR(100) NOT NULL,
    type_pokemon VARCHAR(50) NOT NULL,
    level_pokemon INT NOT NULL,
    capture_date DATE,
    uuid_trainer UUID NOT NULL,
    CONSTRAINT fk_pokemon_trainer FOREIGN KEY (uuid_trainer) REFERENCES trainers(uuid_trainer)
);

-- 3. Insertar 3 Entrenadores
INSERT INTO trainers (uuid_trainer, name_trainer, age_trainer, gender_trainer, region_trainer, number_of_pokemons) VALUES
('11111111-1111-1111-1111-111111111111', 'Max', 26, 'Masculino', 'Kanto', 5),
('22222222-2222-2222-2222-222222222222', 'Valeria', 25, 'Femenino', 'Oaxaca', 5),
('33333333-3333-3333-3333-333333333333', 'David', 15, 'Masculino', 'Johto', 5);

-- 4. Insertar 15 Pokémon -- Pokémons de Max
INSERT INTO pokemons (uuid_pokemon, name_pokemon, type_pokemon, level_pokemon, capture_date, uuid_trainer) VALUES
(gen_random_uuid(), 'Raichu', 'Eléctrico', 45, '2025-01-15', '11111111-1111-1111-1111-111111111111'),
(gen_random_uuid(), 'Gengar', 'Fantasma/Veneno', 56, '2025-02-10', '11111111-1111-1111-1111-111111111111'),
(gen_random_uuid(), 'Charmander', 'Fuego', 24, '2025-03-05', '11111111-1111-1111-1111-111111111111'),
(gen_random_uuid(), 'Squirtle', 'Agua', 25, '2025-04-20', '11111111-1111-1111-1111-111111111111'),
(gen_random_uuid(), 'Poliwrath', 'Agua/Lucha', 58, '2025-05-12', '11111111-1111-1111-1111-111111111111');

-- Pokémons de Valeria
INSERT INTO pokemons (uuid_pokemon, name_pokemon, type_pokemon, level_pokemon, capture_date, uuid_trainer) VALUES
(gen_random_uuid(), 'Staryu', 'Agua', 20, '2025-02-14', '22222222-2222-2222-2222-222222222222'),
(gen_random_uuid(), 'Starmie', 'Agua/Psíquico', 30, '2025-03-18', '22222222-2222-2222-2222-222222222222'),
(gen_random_uuid(), 'Psyduck', 'Agua', 15, ' 2025-04-01', '22222222-2222-2222-2222-222222222222'),
(gen_random_uuid(), 'Gyarados', 'Agua/Volador', 9, '2025-06-10', '22222222-2222-2222-2222-222222222222'),
(gen_random_uuid(), 'Goldeen', 'Agua', 22, '2025-07-22', '22222222-2222-2222-2222-222222222222');

-- Pokémon de David
INSERT INTO pokemons (uuid_pokemon, name_pokemon, type_pokemon, level_pokemon, capture_date, uuid_trainer) VALUES
(gen_random_uuid(), 'Charizard', 'Fuego/Volador', 40, '2025-11-05', '33333333-3333-3333-3333-333333333333'),
(gen_random_uuid(), 'Aerodactyl', 'Roca/Volador', 24, '2025-12-12', '33333333-3333-3333-3333-333333333333'),
(gen_random_uuid(), 'Jolteon', 'Electrico', 16, '2025-01-20', '33333333-3333-3333-3333-333333333333'),
(gen_random_uuid(), 'Dragonite', 'Dragón/Volador', 60, '2025-02-25', '33333333-3333-3333-3333-333333333333'),
(gen_random_uuid(), 'Gyarados', 'Agua/Volador', 29, '2025-08-30', '33333333-3333-3333-3333-333333333333');