package if_statement;

public class Or_Operator {

    public static void main(String[] args) {

        int ram= 8;
        String Brand="Lenovo";

        // TRUE || TRUE= TRUE

        if (Brand=="Lenovo" || ram>=8){
            System.out.println("Good quality laptop....TRUE || TRUE= TRUE");
        }
        else {
            System.out.println("Not Good quality laptop....TRUE || TRUE= TRUE");
        }

        //  TRUE || FALSE= TRUE
        Brand="Lenovo";


        if (Brand=="Lenovo" || ram>=8){
            System.out.println("Good quality laptop....TRUE || FALSE= TRUE");
        }
        else {
            System.out.println("Not Good quality laptop....TRUE || FALSE= TRUE");
        }
        //  FALSE || TRUE= TRUE
        Brand="Accer";
        if (Brand=="Lenovo" || ram>=8){
            System.out.println("Good quality laptop....FALSE || TRUE= TRUE");
        }
        else {
            System.out.println("Not Good quality laptop....FALSE || TRUE= TRUE");
        }

        //  FALSE || FALSE= FALSE
        Brand="HP";
        ram=7;
        if (Brand=="Lenovo" || ram>=8){
            System.out.println("Good quality laptop....FALSE || FALSE= FALSE");
        }
        else {
            System.out.println("Not Good quality laptop....FALSE || FALSE= FALSE");
        }


    }
}
