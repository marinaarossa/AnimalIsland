package com.company.Threads;

import com.company.Entity.Animal;
import com.company.Entity.Herbivores.Herbivore;
import com.company.Entity.Plant;
import com.company.Entity.Predators.Predator;
import com.company.Island.Cell;
import com.company.Island.Island;

import java.util.ArrayList;

import static com.company.Island.Cell.animals;
import static com.company.Island.Island.location;

public class LifeCycle extends Thread {
    // животное сыто, если оно съело больше пищи, чем ему нужно для насыщения
    public boolean isSatiety(Animal animal) {
        if (animal.satiety > animal.kgOfFood) {
            return true;
        } else {
            return false;
        }

    }

    // если животное сыто, идём размножаться, если нет, на поиски еды
    public void live() {
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
                ThreadMove threadMove = new ThreadMove();
                threadMove.start();
                for (Animal animal : animals)
                    if (isSatiety(animal) == true) {
                        ThreadBreed threadBreed = new ThreadBreed();
                        threadBreed.start();
                    } else {
                        ThreadEat threadEat = new ThreadEat();
                        threadEat.start();
                    }
            }
        }
    }

    // создаём поток размножения
    class ThreadBreed extends Thread {
        @Override
        public void run() {

            for (Animal animal : animals) {
                animal.breed(animals);
            }

        }
    }

    // создаем поток питания
    class ThreadEat extends Thread {
        @Override
        public void run() {
            for (Animal animal : animals) {
                animal.eat(animals);
            }
        }
    }

    // создаем поток передвижения
    class ThreadMove extends Thread {
        @Override
        public void run() {
            for (Animal animal : animals) {
                animal.move();
            }
        }
    }
}
