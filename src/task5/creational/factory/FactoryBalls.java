package task5.creational.factory;

public class FactoryBalls {
    public Ball createBall(String ball){
        switch (ball){
            case "basketball": return new Basketball();
            case "volleyball": return new Volleyball();
            default: return null;
        }
    }
}
