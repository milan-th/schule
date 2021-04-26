package me.milthe.backend;

import java.util.ArrayList;

public class MannschaftenDatenbank {
    private ArrayList<Mannschaft> datenbank = new ArrayList<>();

    public ArrayList<Mannschaft> getDatenbank() {
        return datenbank;
    }

    public void setDatenbank(Mannschaft mannschaft) {
        datenbank.add(mannschaft);
    }
}
