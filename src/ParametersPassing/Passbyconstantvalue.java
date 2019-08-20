
/*
The formal parameter is initialized with the value
of the actual parameter by making a copy of the actual parameter and then it is a constant value, which can only
be read. You need to use the final keyword in the formal parameter declaration to indicate that you mean to pass
the parameter by constant value. Any attempt to change the value of a parameter, which uses pass by constant value,
results in a compiler error.
 */

package ParametersPassing;

public class Passbyconstantvalue {

    public static void test(final int x, int y) {


        System.out.println("#2: x = " + x + ", y = " + y);

        /* Uncommenting following statement will generate a compile-time error */
        // x = 79; /* Cannot change x. It is passed by constant value */

        y = 223; // Ok to change y

        System.out.println("#3: x = " + x + ", y = " + y);
    }


}
