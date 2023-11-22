package task5.behavior.stratagy;

public class ActionStudent implements Actions{
    private int price=150;
    private Person person;

    public ActionStudent(Person person) {
        this.person = person;
    }

    @Override
    public double payPrice() {
        if(person.getAge()>=17 && person.getAge()<21){
            price*=0.8;
            System.out.println("Сьогодні акція для студентів 20%, оплачуєте: "+price);
        }else{
            System.out.println("Ви не є студентом(");
            System.out.println("Ціна за стіл у більярді: "+price);
        }
        return price;
    }
}
