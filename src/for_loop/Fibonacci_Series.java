package for_loop;

public class Fibonacci_Series {

    public static void main(String[] args) {

        int range=15;
        int no1=0;
        int no2=1;
        int counter=0;

        while (counter<range){

            System.out.println(no1 + " ");

            int no3=no2+no1;
            no1=no2;
            no2=no3;

            counter++;
        }
    }
}
