
/*
It is customary to use all
uppercase letters to name final class variables. It is also a way to define constants in Java programs. The Java class
library has numerous examples where it defines public static final variables to use them as constants.
 */

package FinalClassVariables;

public class Test {

    public static final int YES = 1; //uppercase letters to name final class variables
    public static final int NO = 2; //uppercase letters to name final class variables
    public static final String MSG= "I am a blank final static variable"; //uppercase letters to name final class variables


    public static void main(String[] args) {

        new Test();

        System.out.println(Test.YES+Test.NO+Test.MSG);

    }


    }



    /*
    ou use final variables to define constants. This is the reason that final variables are also called constants.
If the value of a final variable can be computed by the compiler at compile-time, such a variable is a
compile-time constant. If the value of a final variable cannot be computed by the compiler, it is a runtime final
variable. The values of all blank final variables are not known until runtime. References are not computed until
runtime. Therefore, all blank final variables and final reference variables are runtime constants.
Java performs an optimization when you use compile-time constants in an expression. It replaces the use of the
compile-time constant with the actual value of the constant. Suppose you have a Constants class as shown below.
It declares a MULTIPLIER static final variable.

public class Constants {
public static final int MULTIPLIER = 12;
}

 Consider the following statement:

int x = 100 * Constants.MULTIPLIER;

When you compile the above statement, the compiler will replace Constants.MULTIPLIER with its value 12 and
your statement is compiled as

int x = 100 * 12;

Now, 100 * 12 is also a compile-time constant expression. The compiler will replace it with its value 1200 and
your original statement will be compiled as

int x = 1200;

There is one downside of this compiler optimization. If you change the value of the MULTIPLIER final variable in
the Constants class, you must recompile all the classes that refer to the Constants.MULTIPLIER variable. Otherwise,
they will continue using the old value of the MULTIPLIER constant that existed when they were compiled last time.
     */