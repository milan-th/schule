public class Team {
    private String name;
    private int spielstaerke = 10;
    private int punkte;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpielstaerke() {
        return spielstaerke;
    }

    public void setSpielstaerke(int spielstaerke) {
        this.spielstaerke += spielstaerke;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public void trainieren(){
        setSpielstaerke((int)(Math.random()*3));
    }
}
