package task5.creational.factory;

public class Main {
    public static void main(String[] args) {
    FactoryBalls factory = new FactoryBalls();
    Ball ball1 = factory.createBall("basketball");
    Ball ball2 = factory.createBall("volleyball");

    ball1.create();
    ball2.create();
    }
}
