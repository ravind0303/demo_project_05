package array_demo;

public class Array_String {

    public static void main(String[] args) {

        //SYNTAX : Datatype varName []= {value1,value2,value3........};

        String Array[] = {"Rahul", "Mohan","Vikas","Ravi"};

        //TODO varName[INDEX];

        System.out.println("Printing index 0 " + Array[0]);
        System.out.println("Printing index 1 " + Array[1]);
        System.out.println("Printing index 2 " + Array[2]);
        System.out.println("Printing index 3 " + Array[3]);

        //for loop

        for (int i = 0; i < Array.length; i++) {

            System.out.println("Printing Array in  for Loop " + Array[i]);
        }

        //ADVANCED FOR LOOP
        //TODO  for (Datatype varName : Array/Collection){ CODE }

        for(String var : Array){

            System.out.println("Printing Advanced  Loop "+var);
        }


    }
}
