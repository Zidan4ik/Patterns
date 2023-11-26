package task5.behavior.interpreter;

public class ConditionExpression implements Interpreter{
    private String condition;
    private Interpreter num1;
    private Interpreter num2;

    public ConditionExpression(String condition, Interpreter num1, Interpreter num2) {
        this.condition = condition;
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Object interpreter() {
        switch (condition){
            case "!=": return num1.interpreter()!=num2.interpreter();
            case "==": return num1.interpreter()==num2.interpreter();
            case ">": return (int)num1.interpreter()>(int)num2.interpreter();
            case ">=": return (int)num1.interpreter()>=(int)num2.interpreter();
            case "<": return (int)num1.interpreter()<(int)num2.interpreter();
            case "<=": return (int)num1.interpreter()<=(int)num2.interpreter();
            default: return null;
        }
    }
}
