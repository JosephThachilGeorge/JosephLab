package InvokingmethodEXAMPLE;

public class Invokingmethod {


    int n=10; // A static variable
    static int m=200; // An instance variable

    // Declare a static method

    static void method(){

        //System.out.println("Value of n:"+ n);// */ /* A compile-time error */

        // /* We can refer to only static variable m in this method
        //because you are inside a static method */

        System.out.println("value of m:"+m); //This is possible




        }

    // Declare an instance method

    void printmethod()
    {

        /* We can refer to both static and instance variables m and n in this method */

        System.out.println("Value of n:"+ n);
        System.out.println("value of m:"+m);
    }

}
