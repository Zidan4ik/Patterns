package task5.behavior.memento;

public class ProcessSaving {
    private Plan plan;

    public ProcessSaving(Plan plan) {
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
