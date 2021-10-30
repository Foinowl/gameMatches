package com.company.service.impl;

import com.company.entity.Computer;
import com.company.entity.Human;
import com.company.entity.Player;
import com.company.service.*;

public class SimpleGameService implements GameService {
    private final ConsoleService consoleService = new SimpleConsoleService();
    private final MatchesService matchesService = new SimpleMatchesService();
    private final PlayerService computerService = new ComputerService();
    private final PlayerService humanService = new HumanService();
    private final CurrentPlayerService currentPlayerService = new SimpleCurrentPlayerService();

    private final Player computer = new Computer();
    private final Player human = new Human();

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
