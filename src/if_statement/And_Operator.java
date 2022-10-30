package if_statement;

public class And_Operator {

    public static void main(String[] args) {

        int marks=60;
        // TRUE & TRUE= TRUE
        String schoolname="ND COLLAGE";

        if (marks>54 && schoolname=="ND COLLAGE"){
            System.out.println("Student is passed first division....TRUE & TRUE= TRUE");
        }
        else {
            System.out.println("Student is not passed first division.....TRUE & TRUE= TRUE");
        }
        //TRUE & FALSE=FALSE


        if (marks>60 && schoolname=="SRK"){
        System.out.println("Student is cleared exam.....TRUE & FALSE=FALSE");
    }
    else{
            System.out.println("Student is not cleared.....TRUE & FALSE=FALSE");
        }
//False & True =False

  //  if (marks>45 && schoolname=="ND COLLAGE"){

      //  System.out.println("Student is cleared exam.....False & True =False");
  //  }
   // else {
    //    System.out.println("Student is not cleared exam....False & True =False");
   // }

    //False & False=False

  //  if (marks>35 && schoolname=="NIC"){
    //    System.out.println("Student is cleared exam.....False & False=False");
   // }
   // else {
       // System.out.println("Student is not cleared exam......False & False=False");
   // }

    }
}
