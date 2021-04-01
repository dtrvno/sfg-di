package com.springframework.pets;


public class PetServiceFactory {
    public PetService getPetService(String petTyoe) {
        switch (petTyoe) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
