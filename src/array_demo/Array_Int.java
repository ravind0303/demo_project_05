package array_demo;

public class Array_Int {

    public static void main(String[] args) {

        //SYNTAX : Datatype varName []= {value1,value2,value3........};

        int age []={27,47,18,29,48,58,39,29,19,38,};

        //For loop
        for (int i=0; i<age.length; i++){

            System.out.println("Printing Age  .."+age[i]);
        }

        //Advance loop
        for (int var : age){

            System.out.println("Printing Age in Advanced loop "+var);
        }

        int i=0;
        while (i<age.length){
            System.out.println(" Printing age in while loop" +age[i]);
            i++;
        }




    }
}
