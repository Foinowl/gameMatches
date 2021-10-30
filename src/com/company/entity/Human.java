package com.company.entity;

public class Human implements Player{
    private final String name;

    public Human() {
        this.name = "Человек";
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
