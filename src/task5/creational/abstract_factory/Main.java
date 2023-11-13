package task5.creational.abstract_factory;

import task5.creational.abstract_factory.standardmafia.StandardGameMafia;
import task5.creational.abstract_factory.universitymafia.UniversityGameMafia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Звичайна мафія");
       GameMafia team1 = new StandardGameMafia();
        PersonCitizen citizen1 = team1.createPlayer1();
        PersonCitizen citizen2 = team1.createPlayer2();
        PersonDoctor doctor = team1.createPlayer3();
        PersonDon don = team1.createPlayer4();

        citizen1.act();
        citizen2.act();
        doctor.act();
        don.act();

        System.out.println("\n\nСтудентська мафія");
        GameMafia team2 = new UniversityGameMafia();
        PersonCitizen student1 = team2.createPlayer1();
        PersonCitizen student2 = team2.createPlayer2();
        PersonDoctor curator = team2.createPlayer3();
        PersonDon dean = team2.createPlayer4();

        student1.act();
        student2.act();
        curator.act();
        dean.act();
    }
}
