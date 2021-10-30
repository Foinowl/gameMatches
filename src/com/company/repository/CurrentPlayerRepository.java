package com.company.repository;

import com.company.entity.Player;

public interface CurrentPlayerRepository {

    void setCurrentPlayer(Player player);

    Player getPreviousPlayer();
}
