package com.company.Entity.Herbivores;

import com.company.Entity.Animal;
import com.company.Entity.Plant;

import java.util.ArrayList;
import java.util.Random;

import static com.company.Island.Cell.plants;
import static com.company.Island.Island.location;

public class Herbivore extends Animal {

    public Herbivore(int id, double weight, int maxQuantity, int speed, double kgOfFood, int satiety) {
        super(id, weight, maxQuantity, speed, kgOfFood, satiety);
    }
@Override
    public void eat(ArrayList<Animal> animals){
    for (int i = 0; i < location.length; i++) {
        for (int j = 0; j < location[i].length; j++) {
    Random random = new Random();
    Animal randomAnimal = animals.get(random.nextInt(animals.size()));

    if (randomAnimal instanceof Herbivore && plants != null && plants.size() > 0 && animals.contains(randomAnimal)) {
        randomAnimal.satiety +=  Plant.weight;
        plants.remove(0);
    }else animals.remove(randomAnimal); // умрет с голоду если не поест
}}}
}
