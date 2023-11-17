package task5.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shop shop = new Shop(new Toy("трансформери",5,500));

        Toy toy = shop.getClone();
        System.out.println(toy);

        Toy toy2 = (Toy)toy.clone();
        System.out.println(toy2);


    }
}
