package com.company.service.impl;

import com.company.entity.Player;
import com.company.repository.CurrentPlayerRepository;
import com.company.repository.SimpleCurrentPlayerRepository;
import com.company.service.CurrentPlayerService;

public class SimpleCurrentPlayerService implements CurrentPlayerService {
    private CurrentPlayerRepository currentPlayerRepository = new SimpleCurrentPlayerRepository();

    @Override
    public void setCurrentPlayer(Player currentPlayer) {
        currentPlayerRepository.setCurrentPlayer(currentPlayer);
    }

    @Override
    public Player getPreviousPlayer() {
        return currentPlayerRepository.getPreviousPlayer();
    }
}
