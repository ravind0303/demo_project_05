package for_loop;

public class DemoOccure {

    public static void main(String[] args) {
       // String str="AGRA";

       // int allcount =str.length();
      //  System.out.println("all lenth :" +allcount);

        String str="TAJMAHAL";
        char ch='A';
        int count=0;

        for (int i=0;i<str.length();i++){

            if (str.charAt(i) ==ch){
                count++;
            }
            System.out.println("Occurance of " +ch+ " " +count);
        }
    }




}
