package com.company.Island;

import com.company.Entity.Animal;
import com.company.Entity.Plant;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {
    public static ArrayList<Animal> animals = new ArrayList<>();
    public static ArrayList<Plant> plants = new ArrayList<>();
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}
