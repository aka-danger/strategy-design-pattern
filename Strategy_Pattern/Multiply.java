package Strategy_Pattern;

/**
 * Created by BRENDON on 2017/02/17.
 */
public class Multiply implements Calculation {

    private static  Multiply instance = new Multiply();
    private Multiply(){}
    public static Multiply getInstance(){
        return instance;
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x*y;
    }
}
