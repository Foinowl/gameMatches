package com.company.service.impl;

import com.company.repository.MatchesRepository;
import com.company.repository.SimpleMatchesRepository;
import com.company.service.MatchesService;

public class SimpleMatchesService implements MatchesService {
    private MatchesRepository matchesRepository = new SimpleMatchesRepository();

    public SimpleMatchesService() {
    }

    @Override
    public int getMatches() {
        return matchesRepository.getMatches();
    }

    @Override
    public void setMatches(int matchesLeft) {
        matchesRepository.setMatches(matchesRepository.getMatches() - matchesLeft);
    }

    @Override
    public boolean isLastMatch() {
        return matchesRepository.isLastMatch();
    }


}
