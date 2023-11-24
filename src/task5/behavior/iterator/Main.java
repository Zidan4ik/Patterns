package task5.behavior.iterator;

public class Main {
    public static void main(String[] args) {
        String[] vacancies = new String[]{"Driver","Teacher","Speaker","Officer","AirPilot"};
        Collection collection = new Vacancies(vacancies);
        Iterator iterator = collection.getIterator();

        System.out.println("Патерн Iterator");
        System.out.println("Список вакансій для роботи: ");

        int index=0;
        while(iterator.hasNext()){
            index++;
            System.out.println(index+"-"+iterator.next());
        }
    }
}
