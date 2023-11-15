package task5.structure.adapter;

public class ServiceShop {
    public void processingProduct(OfflineStoreI store){
        store.sendProduct();
    }
}
