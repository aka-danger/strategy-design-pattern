package Strategy_Pattern;

/**
 * Created by BRENDON on 2017/02/17.
 */
public class Divide implements Calculation {

    //Singleton design pattern
    private static Divide instance = new Divide(); //create instance of class
    private Divide(){} //private so the constructor can not be instantiated
    public static Divide getInstance(){ //return the only avalible object
        return instance;
    }

    @Override
    public Double calculate(Double x, Double y) {
        if(y == 0)
            return 0.0;
        else return x/y;
    }
}
