package com.company;

import com.company.Entity.Animal;
import com.company.Entity.Herbivores.WildBoar;
import com.company.Entity.Plant;
import com.company.Island.Island;
import com.company.Threads.ExecutorIsland;

public class Main {

    public static void main(String[] args) {

        Island island = new Island();
        island.fill();
        island.populateTheIsland();
        ExecutorIsland executorIsland = new ExecutorIsland();
        executorIsland.executorStart();
    }
}
