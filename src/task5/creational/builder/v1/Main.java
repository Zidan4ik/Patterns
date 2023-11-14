package task5.creational.builder.v1;

public class Main {
    public static void main(String[] args) {
        TransformerBuilder builder = new TransformerAutoBot();
        TransformerDirector director = new TransformerDirector(builder);

        director.buildTransformer();
        Transformer autoBot = builder.info();
        System.out.println(autoBot);

//        TransformerBuilder transformerBuilder = new TransformerAutoBot();
//        TransformerDirector transformerDirector = new TransformerDirector(transformerBuilder);
//
//        transformerDirector.buildTransformer();
//
//        Transformer transformer = transformerBuilder.info();
//        System.out.println(transformer);
    }
}
