package task5.behavior.mediator;

public class AudiCar implements Transport {
    private boolean isRepaired;
    private String mark;
    private int year;

    public AudiCar(String mark, int year) {
        this.mark = mark;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void isRepaired(boolean isRepaired) {
        if (isRepaired) {
            System.out.println("відремонтована і поставлена в гараж");
            this.isRepaired = true;
        } else {
            System.out.println("ще ремонтується");
            this.isRepaired = false;
        }
    }

    @Override
    public AudiCar getTransport() {
        return new AudiCar(mark, year);
    }
}
