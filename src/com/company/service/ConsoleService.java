package com.company.service;

import com.company.entity.Player;

public interface ConsoleService {

    void printNumberFromUserMove(int countPulledMatches);

    void printNumberFromComputerMove(int pulledMatches);

    void printPlayerWinner(Player player);

    void printErrorInfo();

    void printStartGame();

    void printEndGame();

    void printCountMatches(int matchesLeft);

    int getNumberFromUserMove();
}
