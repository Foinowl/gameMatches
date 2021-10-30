package com.company.service.impl;

import com.company.entity.Player;
import com.company.service.ConsoleService;

import java.util.Scanner;

public class SimpleConsoleService implements ConsoleService {

    @Override
    public void printNumberFromUserMove(int countPulledMatches) {
        System.out.println(" - Ход игрока. Введите количество спичек: " + countPulledMatches + " .");
    }

    @Override
    public void printNumberFromComputerMove(int pulledMatches) {
        System.out.println(" - Количество выбранных компьютером спичек = " + pulledMatches + ".");
    }

    @Override
    public void printPlayerWinner(Player player) {
        System.out.println("Для игрока осталась последняя спичка. " + player + " проиграл.");
    }

    @Override
    public void printErrorInfo() {
        System.out.println("Некорректное количество спичек. ");
    }

    @Override
    public void printStartGame() {
        System.out.print("Начало игры. ");
    }

    @Override
    public void printEndGame() {
        System.out.print("Конец игры. ");
    }

    @Override
    public void printCountMatches(int matchesLeft) {
        System.out.println("На столе осталось "
                + matchesLeft + " "
                + choosePluralMerge(matchesLeft, "спичка", "спички", "спичек"));
    }

    public int getNumberFromUserMove() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private String choosePluralMerge(int number, String... words) {
        String word;
        if (number % 10 == 1 && number % 100 != 11) {
            word = words[0];
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            word = words[1];
        } else {
            word = words[2];
        }

        return word;
    }
}
