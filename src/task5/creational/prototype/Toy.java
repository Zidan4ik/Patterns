package task5.creational.prototype;

public class Toy implements Prototype{
    private String name;
    private int count;
    private double price;

    public Toy(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

}
