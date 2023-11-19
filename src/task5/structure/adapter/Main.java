package task5.structure.adapter;

public class Main {
    public static void main(String[] args) {
        OnlineStoreI storeOnn = new OnlineStore();
        OfflineStoreI storeOff = new OfflineStore();
        ServiceShop service = new ServiceShop();

        AdapterShop storeOnn2 = new AdapterShop(storeOnn);
        service.processingProduct(storeOff);
        service.processingProduct(storeOnn2);

//        service.processingProduct(storeOnn2);
    }
}
