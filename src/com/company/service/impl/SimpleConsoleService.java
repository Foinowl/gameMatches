package com.company.service.impl;

import com.company.entity.Player;
import com.company.service.ConsoleService;

import java.util.Scanner;

public class SimpleConsoleService implements ConsoleService {

    @Override
    public int printNumberFromUserMove() {
        int countPulledMatches = getNumberFromUserMove();
        System.out.println(" - Ход игрока. Введите количество спичек: " + countPulledMatches);
        return countPulledMatches;
    }

    @Override
    public void printNumberFromComputerMove(int pulledMatches) {
        System.out.println(" - Количество выбранных компьютером спичек = " + pulledMatches + ".");
    }

    @Override
    public void printPlayerWinner(Player player) {
        System.out.println("Для игрока осталась последняя спичка." + player + "проиграл");
    }

    @Override
    public void printErrorInfo() {
        System.out.println("Некорректное количество спичек");
    }

    @Override
    public void printStartGame() {
        System.out.print("Начало игры.");
    }

    @Override
    public void printEndGame() {
        System.out.print("Конец игры.");
    }


    @Override
    public void printCountMatches(int matchesLeft) {
        System.out.println("На столе осталось" + matchesLeft + "спичек");
    }

    private int getNumberFromUserMove() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
