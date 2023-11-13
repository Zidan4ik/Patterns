package task5.creational.abstract_factory.universitymafia;

import task5.creational.abstract_factory.PersonCitizen;
import task5.creational.abstract_factory.PersonDoctor;
import task5.creational.abstract_factory.PersonDon;
import task5.creational.abstract_factory.GameMafia;

public class UniversityGameMafia implements GameMafia {
    @Override
    public PersonCitizen createPlayer1() {
        return new Student();
    }

    @Override
    public PersonCitizen createPlayer2() {
        return new Student();
    }

    @Override
    public PersonDoctor createPlayer3() {
        return new Curator();
    }

    @Override
    public PersonDon createPlayer4() {
        return new Dean();
    }
}
