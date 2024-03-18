package com.koike;

public class BoxingData {
    private String name;
    private String weight;

    private Integer defense;

    public BoxingData(String name, String weight, Integer defense) {
        this.name = name;
        this.weight = weight;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public Integer getDefense() {
        return defense;
    }
}