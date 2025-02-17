package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class PetExpert {

    public List<String> getBreeds(String category) {
        List<String> breeds = new ArrayList<>();

        switch (category) {
            case "Pastores":
                breeds.add("Pastor Catalán");
                breeds.add("Pastor Alemán");
                breeds.add("Komondor");
                breeds.add("Pastor Australiano");
                break;
            case "Pinscher":
                breeds.add("Dobermann");
                breeds.add("Pinscher Alemán");
                breeds.add("Pinscher Miniatura");
                breeds.add("Schnauzer");
                break;
            case "Terriers":
                breeds.add("Fox Terrier");
                breeds.add("Yorkshire Terrier");
                breeds.add("Jack Russell Terrier");
                breeds.add("Border Terrier");
                break;
            default:
                breeds.add("No hay razas disponibles");
        }

        return breeds;
    }
}