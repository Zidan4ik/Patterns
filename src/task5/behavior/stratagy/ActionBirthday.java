package task5.behavior.stratagy;

import java.time.LocalDate;
import java.util.Date;

public class ActionBirthday implements Actions{
    private int price=150;
    private Person person;

    public ActionBirthday(Person person) {
        this.person = person;
    }

    @Override
    public double payPrice() {
        int day = LocalDate.now().getDayOfMonth();
        int month = LocalDate.now().getMonthValue();

        if((person.getDate().getMonthValue() == month) && (person.getDate().getDayOfMonth() == day)){
            System.out.println("Сьогодні персональна акція для вас. " +
                    "Оскільки у вас день народження отримуєте знижку 100% на більярд та один безплатний напій на ваш смак, на барі");
            price*=0;
            System.out.println("Ціна за більярд: "+price);
        }else{
            System.out.println("Ціна за більярд: "+price);
        }
        return price;
    }
}
