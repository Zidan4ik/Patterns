package task5.behavior.memento;

public class ProcessSaving {
    private final String title;
    private final String time;

    public ProcessSaving(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }
}
