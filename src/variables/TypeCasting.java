package variables;

public class TypeCasting {

    public static void main(String[] args) {


        int number = 455;
        int percentage = 10;

        //Type casting
        double result = (double) (number * percentage) / 100;
        float result1=(float)(number*percentage)/100;

        System.out.println("Variable value of result is  : "+result);

        System.out.println("Variable value of result is : "+result1);
    }

}
