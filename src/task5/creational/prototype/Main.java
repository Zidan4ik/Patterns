package task5.creational.prototype;

public class Main {
    public static void main(String[] args) {


        FactoryToys factory = new FactoryToys(new Toy("transformer",5,500));
        Toy toy1 = factory.createToy();

        factory.setToy(new Toy("rabbit",1,1000));
        Toy toy2 = factory.createToy();

        System.out.println(toy1);
        System.out.println(toy2);


        Toy originaltoy = new Toy("bear",100,15);
        System.out.println();
        System.out.println(originaltoy);
        Toy copytoy = (Toy)originaltoy.clone();
        System.out.println(copytoy);

    }
}
