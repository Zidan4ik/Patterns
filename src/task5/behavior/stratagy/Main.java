package task5.behavior.stratagy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BilliardClub club = new BilliardClub();
        Person roma = new Person("Roma",19, LocalDate.of(2003,12,28));
        Person masha = new Person("Masha",19,LocalDate.of(2004,11,23));

        System.out.println("Патерн Strategy");

        System.out.println("Ціни на більярд - "+ LocalDate.now());
        System.out.println();
        club.setAction(new ActionFriend(3));
        club.showPrice();
        System.out.println();
        club.setAction(new ActionFriend(6));
        club.showPrice();
        System.out.println();
        club.setAction(new ActionBirthday(roma));
        club.showPrice();
        System.out.println();
        club.setAction(new ActionStudent(roma));
        club.showPrice();
        System.out.println();
        club.setAction(new ActionStudent(masha));
        club.showPrice();
        System.out.println();
        club.setAction(new ActionBirthday(masha));
        club.showPrice();

    }
}
