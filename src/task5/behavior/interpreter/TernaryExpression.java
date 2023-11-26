package task5.behavior.interpreter;


public class TernaryExpression implements Interpreter{
    private Interpreter condition;
    private Interpreter ifTrue;
    private Interpreter ifFalse;

    public TernaryExpression(Interpreter condition, Interpreter ifTrue, Interpreter ifFalse) {
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    @Override
    public Object interpreter() {
        return (boolean)condition.interpreter()?ifTrue.interpreter():ifFalse.interpreter();
    }
}
