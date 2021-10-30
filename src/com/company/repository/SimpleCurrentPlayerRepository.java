package com.company.repository;

import com.company.entity.Player;

public class SimpleCurrentPlayerRepository implements CurrentPlayerRepository {
    private Player currentPlayer;
    private Player previousPlayer;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.previousPlayer = getCurrentPlayer();
        this.currentPlayer = currentPlayer;
    }

    public Player getPreviousPlayer() {
        return previousPlayer;
    }
}
