package task5.structure.decorate;

public class WarriorDecorator extends TransformerDecorate{

    public WarriorDecorator(Transformer transformer) {
        super(transformer);
    }
    public String fire(){
        return "\nТрансформер може вести вогонь";
    }
    @Override
    public String acts() {
        return super.acts()+fire();
    }
}
