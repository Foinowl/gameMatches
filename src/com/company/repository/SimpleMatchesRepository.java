package com.company.repository;

public class SimpleMatchesRepository implements MatchesRepository {
    private int matches = 20;

    public SimpleMatchesRepository() {
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    @Override
    public boolean isLastMatch() {
        return getMatches() == 1;
    }
}
