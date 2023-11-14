package task5.creational.builder.v1;

public class TransformerDeceptionBot implements TransformerBuilder {
    private Transformer transformer = new Transformer();
    @Override
    public void buildName() {
        transformer.setName("Megatron");
    }

    @Override
    public void buildColor() {
        transformer.setColor("black-silver");
    }

    @Override
    public void buildIsAirPlane() {
        transformer.setTransformationAirplane(true);
    }

    @Override
    public void buildIsCar() {
        transformer.setTransformationCar(false);
    }

    @Override
    public void buildIsTank() {
        transformer.setTransformationTank(false);
    }


    @Override
    public void buildIsAutobot() {
        transformer.setAutoBot(false);
    }

    @Override
    public Transformer info() {
        return transformer;
    }
}
