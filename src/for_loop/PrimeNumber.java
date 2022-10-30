package for_loop;

import static java.lang.Boolean.TRUE;

public class PrimeNumber {

    public static void main(String[] args) {

        int digit=11;
        boolean flag=true;

        for (int i=2; i< digit;i++){

            if (digit % i==0){
                flag=false;
                break;


            }
        }
        if (flag){
            System.out.println("This number is prime number .."+digit);

        }else {
            System.out.println("This number is not prime number.."+digit);
        }

    }
}
