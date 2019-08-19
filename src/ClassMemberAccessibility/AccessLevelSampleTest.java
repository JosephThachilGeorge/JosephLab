package ClassMemberAccessibility;
//A Test Class Loated in the Same Package as the AccessLevel Class.  "AccessLevelSampleTest" in same pakage
public class AccessLevelSampleTest {

    public static void main(String[] args) {

        AccessLevelSample ne=new AccessLevelSample();

        // int a=ne.n1; not possible , private access level not possible

        int b=ne.n2; // package-level access possible

        int c=ne.n3; //protected access level possible

        int d=ne.n4; // public access level possible

        int e=ne.n5; // static access level possible


        System.out.println("n2:"+b+"\n"+"n3:"+c+ "\n"+"n4:"+d+"\n"+"n5:"+e);

        System.out.println("*********************************************");

        /*
        Output
        n2:200
        n3:300
        n4:400
        n5:500
         */

       // ne.m1(); not possible
        ne.m2(); // package-level access possible
        ne.m3(); //protected access level possible
        ne.m4(); // public access level possible
        ne.m5(); // static access level possible



        /* Modify the values of instance variables */
        //ne.n1=4000 not possible
        ne.n2=5000;// package-level access possible
        ne.n3=5001; //protected access level possible
        ne.n4=5002; // public access level possible
        ne.n5=5002; // static access level possible

        System.out.println("n2:"+ne.n2+"\n"+"n3:"+ne.n3+ "\n"+"n4:"+ne.n4+"\n"+"n5:"+ne.n5);

        System.out.println("\nAfter modifying n2, n3, n4 and n5");

        ne.m2();
        ne.m3();
        ne.m4();
        ne.m5();


    }
}


/*

Suppose you want the outside world to read and modify the value of the otherwise inaccessible private instance
variable v1. You need to add two public methods, getV1() and setV1(), to the AccessLevel class; these two methods
will read and modify the value of the v1 instance variable. Your modified AccessLevel class would look as follows:

public class AccessLevel {
private int v1;

Other code goes here

    public int getV1() {
        return this.v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }
}


if A Test Class Located in a Different Package from the AccessLevel Class

public varriabelo and public method can be accessable


  You must consider the access level of both the class and its member to determine whether a class member is
accessible. The access level of a class member may make it accessible to a part of a program. However, that part of a
program can access the class member only if the class itself, to which the member belongs, is also accessible.

 */

