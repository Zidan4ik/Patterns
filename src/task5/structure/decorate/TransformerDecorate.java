package task5.structure.decorate;

abstract class TransformerDecorate implements Transformer {
    protected Transformer transformer;

    public TransformerDecorate(Transformer transformer) {
        this.transformer = transformer;
    }

    @Override
    public String acts() {
        return transformer.acts();
    }
}
