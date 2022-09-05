package com.company.Entity;

import com.company.Actions.AnimalFactory;
import com.company.Actions.Direction;
import com.company.Entity.Herbivores.Herbivore;
import com.company.Island.Cell;
import com.company.Island.Island;
import com.company.Entity.Predators.Predator;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.Island.Cell.animals;
import static com.company.Island.Island.location;

public abstract class Animal {
    public double weight; //масса животного
    public int maxQuantity; // макс кол-во животных на одной локации
    public int speed; // скорость перемещения (сколько клеток за ход)
    public double kgOfFood; // сколько кг пищи нужно для насыщения
    public int id; // номер животного
    public int satiety; // сытость

    public Animal(int id, double weight, int maxQuantity, int speed, double kgOfFood, int satiety) {
        this.weight = weight;
        this.maxQuantity = maxQuantity;
        this.speed = speed;
        this.kgOfFood = kgOfFood;
        this.id = id;
        this.satiety = satiety;
    }

    public void eat(ArrayList<Animal> animals) {
        System.out.println("eat");
    }

    public void breed(ArrayList<Animal> animals) {
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
        int n = (int) Math.floor(Math.random() * 15);
        for (Animal animal : animals){
            if (animal.id == n){
                animals.add(AnimalFactory.makingAnimals(n));
            }
        } }

        }
    }

    public Direction chooseDirection() {
        int side = ThreadLocalRandom.current().nextInt(1, 4);
        Direction direction = switch (side) {
            case 1 -> Direction.NORTH;
            case 2 -> Direction.SOUTH;
            case 3 -> Direction.WEST;
            case 4 -> Direction.EAST;
            default -> null;
        };
        return direction;
    }

    public void move() {
        for (int x = 0; x < location.length; x++) {
            for (int y = 0; y < location[x].length; y++) {
                if (chooseDirection() == Direction.NORTH) {
                    location[x][y + 1].getAnimals().add(location[x][y].getAnimals().get(0));
                    location[x][y].getAnimals().remove(0);
                } else if (chooseDirection() == Direction.SOUTH) {
                    location[x][y - 1].getAnimals().add(location[x][y].getAnimals().get(0));
                    location[x][y].getAnimals().remove(0);
                } else if (chooseDirection() == Direction.EAST) {
                    location[x + 1][y].getAnimals().add(location[x][y].getAnimals().get(0));
                    location[x][y].getAnimals().remove(0);
                } else if (chooseDirection() == Direction.WEST) {
                    location[x - 1][y].getAnimals().add(location[x][y].getAnimals().get(0));
                    location[x][y].getAnimals().remove(0);
                }
            }
        }
    }
}

