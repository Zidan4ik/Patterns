package task5.structure.composite;

public class Salad implements Dish{
    private String name;
    private double price;
    private int time;

    public Salad(String name, double price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }
    @Override
    public int count(){return 1;}

    @Override
    public void showInfo() {
        System.out.println("Назва блюдо: "+name+", ціна: "+price+", час приготування: "+ time);
    }
}
