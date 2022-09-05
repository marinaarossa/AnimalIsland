package com.company.Island;

import com.company.Actions.AnimalFactory;
import com.company.Entity.Animal;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.Island.Cell.animals;

public class Island {
    public static final Cell[][] location = new Cell[3][3];

    public void fill() {
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
                location[i][j] = new Cell();

            }

        }
    }

    public void populateTheIsland() {
        AnimalFactory animalFactory = new AnimalFactory();
        int animalId = 0;
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
                animalId = ThreadLocalRandom.current().nextInt(0, 14);
                animals.add(animalFactory.makingAnimals(animalId));


            }
        }
    }
}
