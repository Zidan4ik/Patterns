package task5.structure.decorate;

public class MedicDecorator extends TransformerDecorate{

    public MedicDecorator(Transformer transformer) {
        super(transformer);
    }
    public String help(){
        return "\nТрансформер може лікувати";
    }
    @Override
    public String acts() {
        return super.acts()+ help();
    }
}
