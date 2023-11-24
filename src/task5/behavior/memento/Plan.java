package task5.behavior.memento;

public class Plan {
    private String title;
    private String time;

    public Plan() {
    }

    public Plan(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public ProcessSaving save(){
        return new ProcessSaving(new Plan(this.title,this.time));
    }
    public void load(ProcessSaving processSaving){
        title=processSaving.getPlan().title;
        time=processSaving.getPlan().time;
    }
    @Override
    public String toString() {
        return "Title: " + this.title +
                "\nTime: " + this.time+"" +
                "\n";
    }
}
