package com.company.Actions;


import com.company.Entity.Animal;
import com.company.Entity.Herbivores.*;
import com.company.Entity.Predators.*;

public class AnimalFactory {
    public static Animal makingAnimals(int id) {
        Animal animal = switch (id) {
            case 0 -> new Wolf();
            case 1 -> new Snake();
            case 2 -> new Fox();
            case 3 -> new Bear();
            case 4 -> new Eagle();
            case 5 -> new Horse();
            case 6 -> new Deer();
            case 7 -> new Rabbit();
            case 8 -> new Mouse();
            case 9 -> new Goat();
            case 10 -> new Sheep();
            case 11 -> new WildBoar();
            case 12 -> new Buffalo();
            case 13 -> new Duck();
            case 14 -> new Caterpillar();
            default -> null;
        };
        return animal;
    }
}
