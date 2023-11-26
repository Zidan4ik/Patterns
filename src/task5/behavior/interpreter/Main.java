package task5.behavior.interpreter;

public class Main {
    public static void main(String[] args) {
        ConditionExpression condition = new ConditionExpression(
                "<",
                new Constant(5),
                new Constant(10));
        TernaryExpression ternaryExpression = new TernaryExpression(
                condition,
                new Constant("Hello Man"),
                new Constant("Hello Woman"));

        System.out.println(ternaryExpression.interpreter());

        condition= new ConditionExpression(
                "==",
                new Constant("roma"),
                new Constant("roma")
        );
        ternaryExpression = new TernaryExpression(
                condition,
                new Constant("true"),
                new Constant("false")
        );
        System.out.println(ternaryExpression.interpreter());
    }
}
