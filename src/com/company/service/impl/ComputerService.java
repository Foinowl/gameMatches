package com.company.service.impl;

import com.company.service.ConsoleService;
import com.company.service.MatchesService;
import com.company.service.PlayerService;

public class ComputerService implements PlayerService {
    @Override
    public void movePlayer(ConsoleService consoleService, MatchesService matchesService) {
        int matchesLeft = matchesService.getMatches();

        while (matchesLeft % 4 != 1) {
            matchesLeft--;
        }
        int pulledMatches = matchesService.getMatches() - matchesLeft;
        consoleService.printNumberFromComputerMove(pulledMatches);
        matchesService.setMatches(pulledMatches);
    }
}
