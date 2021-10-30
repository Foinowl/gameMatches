package com.company.service.impl;

import com.company.repository.MatchesRepository;
import com.company.service.ConsoleService;
import com.company.service.PlayerService;

public class ComputerService implements PlayerService {
    @Override
    public void movePlayer(ConsoleService consoleService, MatchesRepository matchesRepository) {
        int matchesLeft = matchesRepository.getMatches();

        while (matchesLeft % 4 != 1) {
            matchesLeft--;
        }
        int pulledMatches = matchesRepository.getMatches() - matchesLeft;
        consoleService.printNumberFromComputerMove(pulledMatches);
        matchesRepository.setMatches(matchesRepository.getMatches() - pulledMatches);
    }
}
