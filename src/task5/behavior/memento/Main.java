package task5.behavior.memento;

public class Main {
    public static void main(String[] args) {
        Plan plan;
        Schedule schedule = new Schedule();

        System.out.println("\bPlans on day:\n");
        System.out.println("plan 1:");
        plan = new Plan("working time","12 am");
        System.out.println(plan);


        System.out.println("plan 2:");
        plan = new Plan("lunch time","15:00 am");
        System.out.println(plan);
        System.out.println("Process saving plan 2\n");
        schedule.setSaving(plan.save());

        System.out.println("plan 3:");
        plan = new Plan("walking time","20:00 am");
        System.out.println(plan);


        plan.load(schedule.getSaving());
        System.out.println("back to saving plan 2: \n"+ plan);

    }
}
