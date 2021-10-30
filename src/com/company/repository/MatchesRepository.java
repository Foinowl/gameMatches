package com.company.repository;

public interface MatchesRepository {

    int getMatches();

    void setMatches(int matches);

    boolean isLastMatch();

    boolean isEmpty();
}
