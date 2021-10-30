package com.company.service.impl;

import com.company.entity.Computer;
import com.company.entity.Human;
import com.company.entity.Player;
import com.company.repository.MatchesRepository;
import com.company.repository.SimpleMatchesRepository;
import com.company.service.ConsoleService;
import com.company.service.GameService;
import com.company.service.MatchesService;
import com.company.service.PlayerService;

public class SimpleGameService implements GameService {
    private ConsoleService consoleService = new SimpleConsoleService();
    private MatchesService matchesService = new SimpleMatchesService();
    private PlayerService computerService = new ComputerService();
    private PlayerService humanService = new HumanService();

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
    }

    @Override
    public void computerMove() {
        consoleService.printCountMatches(matchesService.getMatches());
        computerService.movePlayer(consoleService, matchesService);
    }

    @Override
    public void humanMove() {
        consoleService.printCountMatches(matchesService.getMatches());
        humanService.movePlayer(consoleService, matchesService);
    }
}
