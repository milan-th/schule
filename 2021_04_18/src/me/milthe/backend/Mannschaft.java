package me.milthe.backend;

public class Mannschaft {
    private String name;
    private String hometown;
    private String color;
    private int defenceStat;
    private int midfieldStat;
    private int attackStat;

    public Mannschaft(String name, String hometown, String color, int defenceStat, int midfieldStat, int attackStat) {
        this.name = name;
        this.hometown = hometown;
        this.color = color;
        this.defenceStat = defenceStat;
        this.midfieldStat = midfieldStat;
        this.attackStat = attackStat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDefenceStat() {
        return defenceStat;
    }

    public void setDefenceStat(int defenceStat) {
        this.defenceStat = defenceStat;
    }

    public int getMidfieldStat() {
        return midfieldStat;
    }

    public void setMidfieldStat(int midfieldStat) {
        this.midfieldStat = midfieldStat;
    }

    public int getAttackStat() {
        return attackStat;
    }

    public void setAttackStat(int attackStat) {
        this.attackStat = attackStat;
    }
}
