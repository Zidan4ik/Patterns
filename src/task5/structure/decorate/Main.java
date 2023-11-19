package task5.structure.decorate;

public class Main {
    public static void main(String[] args) {
        Transformer transformer = new WarriorDecorator((new AutoBot("Трансформер вміє перетворюватись в машину")));
        System.out.println(transformer.acts());
    }
}
