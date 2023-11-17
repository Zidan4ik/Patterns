package task5.creational.builder;

public class Main {
    public static void main(String[] args) {
        TransformerBuilder builder = new AutoBot();
        Director director = new Director(builder);

        director.buildAutoBot();

        Transformer autobot1 = builder.info();
        autobot1.setName("Optimus");

        System.out.println(autobot1);

        TransformerBuilder builderD = new Deception();
        Director directorD = new Director(builderD);

        Transformer decipticon = builderD.info();
        decipticon.setName("Megatron");
        directorD.buildDeception();
        System.out.println(decipticon);
    }
}
