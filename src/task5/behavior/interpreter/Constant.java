package task5.behavior.interpreter;

public class Constant implements Interpreter{
    private Object value;

    public Constant(Object value) {
        this.value = value;
    }

    @Override
    public Object interpreter() {
        return value;
    }
}
