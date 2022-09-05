package com.company;

import com.company.Entity.Animal;
import com.company.Entity.Herbivores.Herbivore;
import com.company.Entity.Predators.Predator;
import com.company.Island.Cell;
import com.company.Island.Island;

import static com.company.Island.Cell.animals;

public class Statistic {
    public static boolean isAlive(){
        if (Statistic.countOfAnimals == 0)
            return false;
        else return true;
    }
    public static int countOfAnimals;
    public static void showStatistics() {

        int countOfPredator = 0;
        int countOfHerbivore = 0;
        for (int i = 0; i < Island.location.length; i++) {
            for (int j = 0; j < Island.location[i].length; j++) {

            for (Animal animal : animals) {
                if (animal instanceof Predator) {
                    countOfPredator++;
                }
            }
            for (Animal animal1 : animals) {
                if (animal1 instanceof Herbivore) {
                    countOfHerbivore++;
                }
            }}
        }
       countOfAnimals = countOfHerbivore + countOfHerbivore;
        System.out.println("В данный момент на острове находится " + countOfAnimals + " животных: " + countOfPredator + " хищников," + countOfHerbivore + " травоядных.");
    }
}
