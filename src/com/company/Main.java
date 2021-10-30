package com.company;

import com.company.service.GameService;
import com.company.service.impl.SimpleGameService;

public class Main {

    public static void main(String[] args) {
        GameService game = new SimpleGameService();
        game.startGame();
    }
}
