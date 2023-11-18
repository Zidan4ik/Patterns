package task5.creational.prototype;

public class Shop{
    Toy toy;

    public Shop(Toy toy) {
        this.toy = toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public Toy createToy(){return toy;}

}
