package task5.behavior.memento;

public class Plan {
    private String title;
    private String time;

    public void setPlan(String title,String time){
        this.title = title;
        this.time=time;
    }
    public ProcessSaving save(){
        return new ProcessSaving(title,time);
    }
    public void load(ProcessSaving processSaving){
        title=processSaving.getTitle();
        time=processSaving.getTime();
    }
    @Override
    public String toString() {
        return "Title: " + title +
                "\nTime: " + time+"" +
                "\n";
    }
}
