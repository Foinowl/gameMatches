package com.company.service.impl;

import com.company.service.ConsoleService;
import com.company.service.GameService;

public class SimpleGameService implements GameService {
    private ConsoleService consoleService = new SimpleConsoleService();


    @Override
    public void startGame() {
        consoleService.printStartGame();
        while (true) {
            int a = 5;
            if (a == 5) {
                break;
            }
            computerMove();
            humanMove();
        }
        consoleService.printEndGame();
    }

    @Override
    public void computerMove() {

    }

    @Override
    public void humanMove() {
        int countMatches = consoleService.printNumberFromUserMove();
    }
}
