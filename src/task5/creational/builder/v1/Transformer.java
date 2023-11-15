package task5.creational.builder.v1;

public class Transformer {
    private String name;
    private String color;
    private Transport body;
    private boolean isAutoBot;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBody(Transport body) {
        this.body = body;
    }

    public void setAutoBot(boolean autoBot) {
        isAutoBot = autoBot;
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
}
