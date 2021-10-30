package com.company.entity;

public class Computer implements Player{
    private final String name;

    public Computer() {
        this.name = "Компьюетр";
    }

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
