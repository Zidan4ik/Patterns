package task5.structure.bridge;

public class Main{
    public static void main(String[] args) {
        Transformer autobot = new TransformerAutoBot(new Medic());
        autobot.fraction();
        autobot.info();


        Transformer decipticon = new TransformerDecepticon(new Medic());
        decipticon.fraction();
        decipticon.info();
    }
}