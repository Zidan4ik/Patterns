package task5.structure.decorate;

public class AutoBot implements Transformer{
    String transformation;

    public AutoBot(String transformation) {
        this.transformation = transformation;
    }

    @Override
    public String acts() {
        return transformation;
    }
}
