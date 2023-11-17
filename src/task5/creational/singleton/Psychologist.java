package task5.creational.singleton;

public class Psychologist{
    private static Psychologist psychologist;

    public static Psychologist getInstance(){
        if(psychologist == null){
            psychologist = new Psychologist();
        }
        return psychologist;
    }
    public void workTime(String namePerson,double time){
        System.out.println("Психолог уже спілкується "+time+" години з "+ namePerson);
    }

}