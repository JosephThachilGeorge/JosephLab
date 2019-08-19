package Namehiding;

public class Namehiding {

    int n1=10;
    int n2=2000;


    public void name1(){

        int n1=20;
        int n3=n1;


        System.out.println("valule of n3" +n3); //n3 takes value of n1 from this method. It would take class instance verable n1 value.
                                               // here n3 will take value 20


    }

    void name4(){

        int n3=n1;

        System.out.println("valule of n3" +n3); //* Only instance variable n1 is in scope here */

        System.out.println("valule of n2" +n2);


    }


}

