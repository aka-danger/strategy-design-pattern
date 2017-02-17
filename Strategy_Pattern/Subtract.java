package Strategy_Pattern;

/**
 * Created by BRENDON on 2017/02/17.
 */
public class Subtract implements Calculation {

    //Singleton design pattern
    private static Subtract instance = new Subtract();
    private Subtract(){}
    public static Subtract getInstance(){
        return instance;
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x - y;
    }
}
