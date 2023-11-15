package task5.structure.bridge;

public class TransformerDecepticon implements Transformer {
    Position position;
    Type fraction;

    public TransformerDecepticon(Position position) {
        this.position = position;
    }


    @Override
    public void fraction() {
        this.fraction=Type.decipticon;
    }

    @Override
    public void info() {
        System.out.println("Трансформер відноситься до класу: "+fraction);
        position.position();
    }
}
