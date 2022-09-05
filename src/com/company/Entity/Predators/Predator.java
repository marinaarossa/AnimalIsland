package com.company.Entity.Predators;

import com.company.Entity.Animal;
import com.company.Entity.Herbivores.Herbivore;
import com.company.Entity.Plant;
import com.company.Actions.ProbabilityToEat;

import java.util.ArrayList;

import static com.company.Island.Island.location;

public class Predator extends Animal {

    public Predator(int id, int weight, int maxQuantity, int speed, int kgOfFood, int satiety) {
        super(id, weight, maxQuantity, speed, kgOfFood, satiety);
    }

    @Override
    public void eat(ArrayList<Animal> animals) {
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
        for (Animal animal : animals)
            if (animal instanceof Predator) {
                for (Animal animal2 : animals) {
                    if (animal2 instanceof Herbivore && ProbabilityToEat.eatingOpportunity(animal, animal2) == true) {
                        animal.satiety += animal2.weight;
                        animals.remove(animal2);
                    }  else animals.remove(animal);
                }
            }
    }}}
}
