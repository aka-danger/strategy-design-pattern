package Strategy_Pattern;

/**
 * Created by BRENDON on 2017/02/17.
 */
public class Add implements Calculation {

    private static Add instance = new Add();
    private Add(){}
    public static Add getInstance(){return instance;}

    @Override
    public Double calculate(Double x, Double y) {
        return x+y;
    }
}
