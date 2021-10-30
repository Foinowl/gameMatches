package com.company.service.impl;

import com.company.entity.Computer;
import com.company.entity.Human;
import com.company.entity.Player;
import com.company.service.*;

public class SimpleGameService implements GameService {
    private ConsoleService consoleService = new SimpleConsoleService();
    private MatchesService matchesService = new SimpleMatchesService();
    private PlayerService computerService = new ComputerService();
    private PlayerService humanService = new HumanService();
    private CurrentPlayerService currentPlayerService = new SimpleCurrentPlayerService();

    private Player computer = new Computer();
    private Player human = new Human();

    public SimpleGameService() {
    }

    @Override
    public void startGame() {
        consoleService.printStartGame();

        while (true) {

            computerMove();
            if (matchesService.isLastMatch()) break;
            humanMove();
        }
        consoleService.printEndGame();
        consoleService.printPlayerWinner(currentPlayerService.getPreviousPlayer());
    }

    @Override
    public void computerMove() {
        currentPlayerService.setCurrentPlayer(computer);
        consoleService.printCountMatches(matchesService.getMatches());
        computerService.movePlayer(consoleService, matchesService);
    }

    @Override
    public void humanMove() {
        currentPlayerService.setCurrentPlayer(human);
        consoleService.printCountMatches(matchesService.getMatches());
        humanService.movePlayer(consoleService, matchesService);
    }
}
