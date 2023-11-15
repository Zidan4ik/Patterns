package task5.creational.builder.v1;

public class Main {
    public static void main(String[] args) {
        TransformerBuilder builder = new TransformerAutoBot();
        TransformerDirector director = new TransformerDirector(builder);

        director.buildTransformer();
        Transformer autobot1 = builder.info();
        autobot1.setName("optimus");
        autobot1.setColor("blue-silver");
        System.out.println(autobot1);

        TransformerBuilder builderD = new TransformerDeceptionBot();
        TransformerDirector directorD = new TransformerDirector(builderD);
        Transformer decipticon = builderD.info();
        System.out.println(decipticon);
        directorD.buildTransformer();
        decipticon = builderD.info();
        System.out.println(decipticon);
    }
}
