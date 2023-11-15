package task5.structure.adapter;

public class AdapterShop implements OfflineStoreI{
    OnlineStoreI storeOff;
    public AdapterShop(OnlineStoreI storeOff) {
        this.storeOff = storeOff;
    }

    @Override
    public void sendProduct() {
        storeOff.sendProduct();
    }
}
