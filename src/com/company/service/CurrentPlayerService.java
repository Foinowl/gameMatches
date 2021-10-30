package com.company.service;

import com.company.entity.Player;

public interface CurrentPlayerService {

    void setCurrentPlayer(Player currentPlayer);

    Player getPreviousPlayer();
}
