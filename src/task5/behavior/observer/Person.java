package task5.behavior.observer;

public class Person implements Observer {
    private String name;
    private Health health;

    public Person(String name, Health health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void showInfo(){
        System.out.print(name+ ", це здоров'я Романа:\n");
        System.out.println("тиск: "+((health.getPulse()<80)?health.getPulse():(health.getPulse()>100)?"тиск за 100, випийте ліки":health.getPulse()));
        System.out.println("крокометр: "+((health.getSteps()%500==0 && health.getCalories()!=0)?"ви досягли наступні 500 кроків, так тримати":health.getSteps()));
        System.out.println("калорії: "+((health.getCalories()%100==0 && health.getCalories()!=0)?"вітаю ви спалили "+health.getCalories()+" калорій":health.getCalories()));

    }
}
