package task5.behavior.stratagy;

public class ActionFriend implements Actions{
    private double price=150;
    private int count;

    public ActionFriend(int count) {
        this.count = count;
    }

    @Override
    public double payPrice() {
        if(count>4){
            price*=0.5;
            System.out.println("Сьогодні акція приведи більше 4 друзів і замовте щось на барі, отримаєте знижку на більярдний стіл: 50%");
            System.out.println("Ціна за стіл у більярді: "+price);
        }else{
            System.out.println("Ціна за стіл у більярді: "+price);
        }
        return price;
    }
}
