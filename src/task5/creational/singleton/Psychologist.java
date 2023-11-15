package task5.creational.singleton;

public class Psychologist{
    private static Psychologist psychologist;

    public static Psychologist getInstance(){
        if(psychologist == null){
            psychologist = new Psychologist();
        }
        return psychologist;
    }

    private Psychologist() {
        System.out.println("психолог тільки що був назначний");
    }
    public void workTime(String namePerson,double time){
        System.out.println("Психолог уже спілкується "+time+" години з "+ namePerson);
    }

    public static void main(String[] args) {
        Psychologist.getInstance().workTime("Denys",5);
        Psychologist.getInstance().workTime("Denys",6);
        Psychologist.getInstance().workTime("Roman",2);
    }
}
