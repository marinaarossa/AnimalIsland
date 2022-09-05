package com.company.Threads;

import com.company.Island.Island;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorIsland extends Thread {
    public void executorStart(){
        ScheduledExecutorService executorService = java.util.concurrent.Executors.newScheduledThreadPool(3);
        executorService.scheduleAtFixedRate(new IslandThreads.ThreadPlants(), 0, 2, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new IslandThreads.ThreadLifeCycle(), 0, 2, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new IslandThreads.ThreadStatistics(), 0, 2, TimeUnit.SECONDS);
    }
    }
