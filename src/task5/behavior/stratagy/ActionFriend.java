package task5.behavior.stratagy;

public class ActionFriend implements Actions{
    private Person person;

    public ActionFriend(Person person) {
        this.person = person;
    }

    @Override
    public double payPrice() {
        double price=150;
        if(person.getCountFriends()>4){
            price*=0.5;
            System.out.println("Сьогодні акція приведи більше 4 друзів і замовте щось на барі, отримаєте знижку на більярдний стіл: 50%");
            System.out.println("Ціна за стіл у більярді: "+price);
        }else{
            System.out.println("Ціна за стіл у більярді: "+price);
        }
        return price;
    }
}
