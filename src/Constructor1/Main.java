package Constructor1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human ne=new Human(); // default constructor

        Human.count++;


        ne.name="jose";
        ne.colour="jos";

        String nename=ne.name;
        String necolour=ne.colour;
        long population=Human.count;

       System.out.println("nename:"+nename);
        System.out.println("necolour:"+necolour);

        ne.name="JoseP";

        String changename=ne.name;

        System.out.println("change name:"+changename);
        System.out.println("Population:"+population);


    }
}


/*
Default Initialization of Fields
All fields of a class, static as well as non-static, are initialized to a default value. The default value of a field depends on
its data type.
•	 A numeric field ( byte, short, char, int, long, float, and double) is initialized to zero.
•	 A boolean field is initialized to false.
•	 A reference type field is initialized to null.
According to the above rules, the fields of the Human class will be initialized as follows:
•	 The count class variable is initialized to zero because it is of numeric type. This is the reason,
Human.count++ evaluated to 1 (0 + 1 = 1) as shown in the output of Listing 6-2.
•	 The name and gender instance variables are of String type. String is a reference type. They are
initialized to null. Recall that a copy of the name and gender fields exists for every object of the
Human class, and each copy of name and gender is initialized to null.
If you consider the above default initialization of the fields of the Human class, it behaves as if you have declared
the Human class as shown below. This declaration of the Human class and the one as shown in Listing 6-1 are the same.

class Human {
String name = null;
String gender = null;
static long count = 0;
}

Listing 6-3 demonstrates the default initialization of fields. The DefaultInit class includes only instance
variables. The class fields are initialized with the same default value as the instance fields. If you declare all fields of
the DefaultInit class as static, the output will be the same
 */