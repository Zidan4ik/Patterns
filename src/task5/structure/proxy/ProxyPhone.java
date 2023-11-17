package task5.structure.proxy;

public class ProxyPhone implements Phone{
    private Phone phone;
    private boolean isAccess;

    public ProxyPhone(boolean isAccess) {
        this.isAccess = isAccess;
    }

    @Override
    public void call(String name) {
        if(isAccess){
            if(phone==null){
                phone=new Iphone("iphone");
            }
            phone.call(name);
        }else{
            System.out.println("Ви не маєте доступу до дзвінків");
        }
    }

    @Override
    public void sendMessage(String message, String name) {
        if(isAccess){
            if(phone==null){
                phone=new Iphone("iphone");
            }
            phone.sendMessage(message, name);
        }else{
            System.out.println("Ви не маєте доступу до надсилань повідомлень");
        }
    }
}
