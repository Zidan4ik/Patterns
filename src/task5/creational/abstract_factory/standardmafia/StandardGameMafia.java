package task5.creational.abstract_factory.standardmafia;

import task5.creational.abstract_factory.PersonCitizen;
import task5.creational.abstract_factory.PersonDoctor;
import task5.creational.abstract_factory.PersonDon;
import task5.creational.abstract_factory.GameMafia;

public class StandardGameMafia implements GameMafia {
    @Override
    public PersonCitizen createPlayer1() {
        return new Citizen();
    }

    @Override
    public PersonCitizen createPlayer2() {
        return new Citizen();
    }

    @Override
    public PersonDoctor createPlayer3() {
        return new Doctor();
    }

    @Override
    public PersonDon createPlayer4() {
        return new Don();
    }
}
