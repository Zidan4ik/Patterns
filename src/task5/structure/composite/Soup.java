package task5.structure.composite;

public class Soup implements Dish{
    private TypeOfSoup soup;
    private double price;
    private int time;

    public Soup(TypeOfSoup soup, double price, int time) {
        this.soup = soup;
        this.price = price;
        this.time = time;
    }
    @Override
    public int count(){return 1;}

    @Override
    public void showInfo() {
        System.out.println("В меню є суп "+soup+", ціна: "+price+", час приготування: "+ time);
    }
}