package task5.structure.proxy;

public class ProxyPhone implements Phone{
    private Iphone iphone;
    private boolean isAccess;

    public ProxyPhone(boolean isAccess) {
        this.isAccess = isAccess;
    }

    @Override
    public void call(String name) {
        if(isAccess){
            if(iphone ==null){
                iphone =new Iphone("iphone");
            }
            iphone.call(name);
        }else{
            System.out.println("Ви не маєте доступу до дзвінків");
        }
    }

    @Override
    public void sendMessage(String message, String name) {
        if(isAccess){
            if(iphone ==null){
                iphone =new Iphone("iphone");
            }
            iphone.sendMessage(message, name);
        }else{
            System.out.println("Ви не маєте доступу до надсилань повідомлень");
        }
    }
}
