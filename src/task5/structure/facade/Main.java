package task5.structure.facade;

public class Main {
    public static void main(String[] args) {
        Processing processing = new Processing(new Phone("iphone",45,15));
        System.out.println("1 Процес");
        processing.onPhone();

        System.out.println("2 Процес");
        processing.dischargePhone(5);
        System.out.println();

        System.out.println("3 Процес");
        processing.chargePhone(10);
        System.out.println();

        System.out.println("4 Процес");
        processing.offPhone();
    }
}
