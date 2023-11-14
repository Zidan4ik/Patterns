package task5.creational.builder.v1;

public class Main {
    public static void main(String[] args) {
        TransformerBuilder builder = new TransformerAutoBot();
        TransformerDirector director = new TransformerDirector(builder);

        director.buildTransformer();
        Transformer autobot1 = builder.info();
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
