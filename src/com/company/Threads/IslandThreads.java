package com.company.Threads;

import com.company.Entity.Plant;
import com.company.Island.Island;
import com.company.Statistic;

public class IslandThreads extends Thread {

    // создаём поток роста растений
    static class ThreadPlants extends Thread {
        @Override
        public void run() {
            Plant.grow();
        }
    }
    // создаём поток вывода статистики
    static class ThreadStatistics extends Thread {
        @Override
        public void run() {
            Statistic.showStatistics();
        }
    }
    // создаем поток жизненного цикла животных
    static class ThreadLifeCycle extends Thread {
        @Override
        public void run() {
            LifeCycle lifeCycle = new LifeCycle();
            lifeCycle.live();
        }
    }
}
