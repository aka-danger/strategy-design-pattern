# strategy-design-pattern
Example of strategy design pattern java

![Alt text](pattern.png?raw=true "Pattern")

# Main.java

```java
public class Main {

    public static void main(String [] args){
        Context context = new Context(Add.getInstance());
        System.out.println("Strategy_Pattern.Add | 5+5 = "+context.calculate(5,5));

        context = new Context(Subtract.getInstance());
        System.out.println("Strategy_Pattern.Subtract | 10-3= "+context.calculate(10,3));

        context = new Context(Multiply.getInstance());
        System.out.println("Strategy_Pattern.Multiply | 5*5= " +context.calculate(5,5));

        context = new Context(Divide.getInstance());
        System.out.println("Strategy_Pattern.Divide | 10/5= "+context.calculate(10,5));

    }
    
}
```
