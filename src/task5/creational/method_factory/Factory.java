package task5.creational.method_factory;

public class Factory implements FactoryBalls {
    @Override
    public Ball createBall(String ball){
        switch (ball){
            case "basketball": return new Basketball();
            case "volleyball": return new Volleyball();
            default: return null;
        }
    }
}
