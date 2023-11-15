package task5.structure.bridge;

public class TransformerAutoBot implements Transformer {
    Position position;
    Type fraction;

    public TransformerAutoBot(Position position) {
        this.position = position;
    }

    @Override
    public void fraction() {
    this.fraction=Type.autobot;
    }

    @Override
    public void info() {
        System.out.println("Трансформер відноситься до класу: "+fraction);
        position.position();
    }
}
