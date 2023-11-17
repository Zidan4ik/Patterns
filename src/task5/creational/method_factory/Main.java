package task5.creational.method_factory;

public class Main {
    public static void main(String[] args) {
    FactoryBalls factory = new Factory();
    Ball ball1 = factory.createBall("basketball");
    Ball ball2 = factory.createBall("volleyball");

    ball1.create();
    ball2.create();
    }
}
