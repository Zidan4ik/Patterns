package task5.creational.builder.v2;

public class Main {
    public static void main(String[] args) {
        Transformer optimus = new Transformer.TransformerBuilder("Optimus")
                .body(Transformation.car)
                .color("Blue-Silver")
                .build();
        System.out.println(optimus);
        Transformer megatron = new Transformer.TransformerBuilder("Megatron")
                .color("black-silver")
                .isAutoBot(false)
                .body(Transformation.airplane)
                .build();
        System.out.println(megatron);
    }
}
