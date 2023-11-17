package task5.structure.adapter;

public class OfflineStore implements OfflineStoreI{
    @Override
    public void sendProduct() {
        System.out.println("Посилка відправлятиметься від офлайн магазину");
    }
}
