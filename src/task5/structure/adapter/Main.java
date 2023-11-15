package task5.structure.adapter;

public class Main {
    public static void main(String[] args) {
        OnlineStoreI storeOnn = new OnlineStore();
        ServiceShop service = new ServiceShop();

        OfflineStoreI storeOnn2 = new AdapterShop(storeOnn);
        service.processingProduct(storeOnn2);
    }
}
