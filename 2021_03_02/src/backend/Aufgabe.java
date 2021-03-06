package backend;

public class Aufgabe {
    private String todo;
    private String datum;
    private String uhrzeit;
    private Mitarbeiter meinMitarbeiter;

    public Aufgabe(String todo, String datum, String uhrzeit, Mitarbeiter meinMitarbeiter) {
        this.todo = todo;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.meinMitarbeiter = meinMitarbeiter;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public Mitarbeiter getMeinMitarbeiter() {
        return meinMitarbeiter;
    }

    public void setMeinMitarbeiter(Mitarbeiter meinMitarbeiter) {
        this.meinMitarbeiter = meinMitarbeiter;
    }
}
