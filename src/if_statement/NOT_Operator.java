package if_statement;

public class NOT_Operator {

    public static void main(String[] args) {
        int marks=23;
        if (marks>33){
            System.out.println("Cleared the exam");
        }
        else {
            System.out.println("Not Cleared the exam");
        }

        if( !(marks<33)){

            System.out.println(" Cleared the exam");
        }
        else {
            System.out.println("Not Cleared the exam");
        }

        //String
        String city="Agra";
        if (!(city=="Agra")){
            System.out.println("Rahul not belonge to Agra");
        }
        else {
            System.out.println("Rahul belonge to Agra ");
        }

    }
}
