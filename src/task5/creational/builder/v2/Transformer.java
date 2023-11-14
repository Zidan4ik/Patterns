package task5.creational.builder.v2;

public class Transformer {
    String name;
    String color;
    Transformation body;
    boolean isAutoBot;
    public Transformer() {
    }
    public Transformer(String name, String color, Transformation body, boolean isAutoBot) {
        this.name = name;
        this.color = color;
        this.body = body;
        this.isAutoBot = isAutoBot;
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", body=" + body +
                ", isAutoBot=" + isAutoBot +
                '}';
    }
   static class TransformerBuilder {
        private String name;
        private String color;
        private Transformation body;
        private boolean isAutoBot;

        public TransformerBuilder(String name) {
            this.name = name;
        }

        public TransformerBuilder color(String color) {
            this.color = color;
            return this;
        }

        public TransformerBuilder body(Transformation body) {
            this.body = body;
            return this;
        }

        public TransformerBuilder isAutoBot(boolean isAutoBot) {
            this.isAutoBot = isAutoBot;
            return this;
        }
        public Transformer build() {
            return new Transformer(name,color,body,isAutoBot);
        }
    }
}



