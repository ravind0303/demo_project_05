package if_statement;

public class Nastede_If_Else {

    public static void main(String[] args) {

        int num=5;
        if (num>0) {

            if (num%2 == 0) {
                System.out.println("EVEN Number...." + num);
            }
            else {
                System.out.println("ODD Number....." + num); 
            }
        }
            else {
                System.out.println("Number is greater than zero..." +num);
            }
        }

}
