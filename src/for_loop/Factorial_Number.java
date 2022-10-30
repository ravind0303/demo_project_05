package for_loop;

public class Factorial_Number {

    public static void main(String[] args) {


        //Factorial number

        int a = 4;
        int b = 1;
        for (int i = a; i > 0; i--) {
            b = b * i;
            System.out.println(+b);
        }
    }
}