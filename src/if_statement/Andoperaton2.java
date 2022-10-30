package if_statement;

public class Andoperaton2 {
    public static void main(String[] args) {
         int age=30;
        String city= "Goa";

        //True & True=True
        if (age>30 && city=="Goa"){
            System.out.println("You are eligible for get car on Rent..True & True=True.");
        }
        else {
            System.out.println("You are not eligible for get car on Rent. Thanks for Visit....True & True=True");
        }

        //True & False=False
         age=30;
        city="Agra";
        if (age>34 && city=="Makkhanpur"){
            System.out.println("You are not eligible for visit city....True & False=False");

        }
        else {
            System.out.println("You are not eligible for visit city......True & False=False");
        }

        //False & True =False
        age=12;
        city="Goa";
        if (age>21 && city=="Goa"){
            System.out.println("You are eligible for visit city....False & True =False");
        }
        else {
            System.out.println("You are not eligible for visit city....False & True =False");
        }

        //False & False=False
        age=15;
        city="Firozabad";

        if (age>12 && city=="Agra"){
            System.out.println("You are eligible for visit city....False & False=False");

        }
        else {
            System.out.println("You are not eligible for visit city....False & False=False");
        }
    }
}
