package task5.creational.method_factory;

public class Basketball implements Ball{
    @Override
    public void create() {
        System.out.println("баскетольний м'яч був створений");
    }
}
