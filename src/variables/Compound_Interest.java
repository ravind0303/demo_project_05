package variables;

public class Compound_Interest {

    public static void main(String[] args) {

        double principal=10000;
        double rate=5;
        double time=3;

        double CI=principal*(Math.pow((1+rate/100),(time))-principal);
        System.out.println("Value of  : "+CI);
    }
}
