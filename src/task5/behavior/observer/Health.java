package task5.behavior.observer;

public class Health {
    private int pulse;
    private int steps;
    private int calories;

    public Health(int pulse, int steps, int calories) {
        this.pulse = pulse;
        this.steps = steps;
        this.calories = calories;
    }
    public void changingHealth(int pulse, int steps, int calories){
        this.pulse=pulse;
        this.steps=steps;
        this.calories=calories;
    }

    public int getPulse() {
        return pulse;
    }

    public int getSteps() {
        return steps;
    }

    public int getCalories() {
        return calories;
    }
}
