package com.company.service.impl;

import com.company.entity.Computer;
import com.company.entity.Human;
import com.company.entity.Player;
import com.company.repository.MatchesRepository;
import com.company.repository.SimpleMatchesRepository;
import com.company.service.ConsoleService;
import com.company.service.GameService;
import com.company.service.PlayerService;

public class SimpleGameService implements GameService {
    private ConsoleService consoleService = new SimpleConsoleService();
    private MatchesRepository matchesRepository = new SimpleMatchesRepository();
    private PlayerService computerService = new ComputerService();
    private PlayerService humanService = new HumanService();

    private Player computer = new Computer();
    private Player human = new Human();

    public SimpleGameService() {
    }

    @Override
    public void startGame() {
        consoleService.printStartGame();

        while (!matchesRepository.isEmpty() || !matchesRepository.isLastMatch()) {

            computerMove();
            humanMove();
        }
        consoleService.printEndGame();
    }

    @Override
    public void computerMove() {
        consoleService.printCountMatches(matchesRepository.getMatches());
        computerService.movePlayer(consoleService, matchesRepository);
    }

    @Override
    public void humanMove() {
        consoleService.printCountMatches(matchesRepository.getMatches());
        humanService.movePlayer(consoleService, matchesRepository);
    }
}
