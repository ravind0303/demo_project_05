package array_demo;

import java.util.Arrays;

public class Double_Array {

    public static void main(String[] args) {

       //
        double mark [] = {34,67,89,67,34,69};
         //for (Datatype varName:Array){code}
        for (double var:mark){
            System.out.println("Printing advance loop  " +var);
        }

        //SYNTAX : Datatype varName []= {value1,value2,value3........};
        double marks1 [] ={54,87,98,93,12,56};
        for (int i=0;i<marks1.length;i++){
            System.out.println(" Printing for loop   "+marks1[i]);
        }

    }
    }



