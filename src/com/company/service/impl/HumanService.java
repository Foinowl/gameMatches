package com.company.service.impl;

import com.company.repository.MatchesRepository;
import com.company.service.ConsoleService;
import com.company.service.PlayerService;

public class HumanService implements PlayerService {
    @Override
    public void movePlayer(ConsoleService consoleService, MatchesRepository matchesRepository) {
        int matchesLeft = consoleService.getNumberFromUserMove();
        while (!isValidMove(matchesLeft)) {
            consoleService.printErrorInfo();
            matchesLeft = consoleService.getNumberFromUserMove();
        }
        consoleService.printNumberFromUserMove(matchesLeft);
        matchesRepository.setMatches(matchesRepository.getMatches() - matchesLeft);
    }

    private boolean isValidMove(int matchesLeft) {
        return !(matchesLeft < 1 || matchesLeft > 3);
    }
}
