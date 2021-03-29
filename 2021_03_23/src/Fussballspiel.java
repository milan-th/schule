public class Fussballspiel {
    Team[] teams = new Team[2];

    public Fussballspiel(Team team1, Team team2){
        teams[0] = team1;
        teams[1] = team2;
    }

    public void spielen(){
        if (teams[0].getSpielstaerke() > teams[1].getSpielstaerke()) {
            System.out.println("Gewonnen hat: " + teams[0].getName());
            teams[0].setPunkte(3);
        } else if (teams[1].getSpielstaerke() > teams[0].getSpielstaerke()) {
            System.out.println("Gewonnen hat: " + teams[1].getName());
            teams[1].setPunkte(3);
        } else {
            System.out.println("Unentschieden");
            teams[0].setPunkte(1);
            teams[1].setPunkte(1);
        }
    }

    public Team getTeams(int index) {
        return teams[index];
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }
}
