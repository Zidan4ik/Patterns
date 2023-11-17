package task5.creational.prototype;

public class Shop {
    Toy toy;

    public Shop(Toy toy) {
        this.toy = toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
    public Toy getClone() throws CloneNotSupportedException {
        return (Toy) toy.clone();
    }
}
