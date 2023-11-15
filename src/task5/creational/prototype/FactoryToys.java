package task5.creational.prototype;

public class FactoryToys {
    Toy toy;

    public FactoryToys(Toy toy) {
        this.toy = toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
    public Toy createToy(){
        return (Toy) toy.clone();
    }
}
