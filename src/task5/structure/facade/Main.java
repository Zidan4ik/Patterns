package task5.structure.facade;

public class Main {
    public static void main(String[] args) {
        Processing processing = new Processing(new Phone("iphone",45,15));
        System.out.println("\n1 Процес");
        processing.onPhone();

        System.out.println("\n2 Процес");
        processing.dischargePhone(5);

        System.out.println("\n3 Процес");
        processing.chargePhone(10);

        System.out.println("\n4 Процес");
        processing.offPhone();
    }
}
