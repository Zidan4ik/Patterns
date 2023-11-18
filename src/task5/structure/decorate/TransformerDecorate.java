package task5.structure.decorate;

class TransformerDecorate implements Transformer {
    private Transformer transformer;

    public TransformerDecorate(Transformer transformer) {
        this.transformer = transformer;
    }

    @Override
    public String acts() {
        return transformer.acts();
    }
}
