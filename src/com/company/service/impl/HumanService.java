package com.company.service.impl;

import com.company.service.ConsoleService;
import com.company.service.MatchesService;
import com.company.service.PlayerService;

public class HumanService implements PlayerService {
    @Override
    public void movePlayer(ConsoleService consoleService, MatchesService matchesService) {
        int pulledMatches = consoleService.getNumberFromUserMove();
        while (!isValidMove(pulledMatches)) {
            consoleService.printErrorInfo();
            pulledMatches = consoleService.getNumberFromUserMove();
        }
        consoleService.printNumberFromUserMove(pulledMatches);
        matchesService.setMatches(pulledMatches);
    }

    private boolean isValidMove(int matchesLeft) {
        return !(matchesLeft < 1 || matchesLeft > 3);
    }
}
