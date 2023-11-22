package task5.behavior.memento;

public class Main {
    public static void main(String[] args) {
        Plan plan = new Plan();
        Schedule schedule = new Schedule();

        System.out.println("\bPlan on day:\n");
        System.out.println("plan 1:");
        plan.setPlan("working time","17:00 am");
        System.out.println(plan);
        System.out.println("Process saving plan 1\n");
        schedule.setSaving(plan.save());

        System.out.println("plan 2:");
        plan.setPlan("lunch time","15:00 am");
        System.out.println(plan);

        System.out.println("plan 3:");
        plan.setPlan("walking time","20:00 am");
        System.out.println(plan);


        plan.load(schedule.getSaving());
        System.out.println("back to saving plan 1: \n"+ plan);

    }
}
