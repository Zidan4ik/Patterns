package task5.structure.bridge;

public class Main{
    public static void main(String[] args) {
        System.out.println();
        Transformer ratchel = new TransformerAutoBot(new Medic());
        ratchel.fraction();
        ratchel.info();
        System.out.println();
        Transformer bamblbi = new TransformerAutoBot(new Warrior());
        bamblbi.fraction();
        bamblbi.info();
        System.out.println();
        Transformer decipticon = new TransformerDecepticon(new Medic());
        decipticon.fraction();
        decipticon.info();
    }
}