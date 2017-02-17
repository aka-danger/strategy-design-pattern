package Strategy_Pattern;

/**
 * Created by BRENDON on 2017/02/18.
 */
public class Context {
    private Calculation calculation;

    public Context (Calculation calculation){
        this.calculation = calculation;
    }

    public double calculate(double x, double y){
        return calculation.calculate(x,y);
    }
}
