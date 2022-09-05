package com.company.Entity;

import com.company.Island.Cell;

import static com.company.Island.Island.location;

public class Plant{
    public static int weight = 1;

    public static void grow(){
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
        for (var plant : Cell.plants) {
            if (Cell.plants.size() < 200) {
                Cell.plants.add(new Plant());
            }
        }
    }}}
}
