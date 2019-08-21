package Final;

public class Main {
    public static void main(String[] args) {

        FinalLocalVariables dis=new FinalLocalVariables(500);

        dis.x=400; //This is possible
        //dis.y=900;//This is not possible
      //dis.z=400; //This is not possible



    }
}

/*
You can declare a local variable final. If you declare a local variable as a blank final variable, you must initialize
it before using. You will receive a compilation time error if you try to change the value of the final local variable
the second time
 */

/*
•	 It must be initialized in one of the instance initializers or all constructors. The following rules
expand on this rule.
•	 If it is initialized in an instance initializer, it should not be initialized again in any other
instance initializers or constructors.
•	 If it is not initialized in any of the instance initializers, the compiler makes sure it is initialized
only once, when any of the constructors is invoked. This rule can be broken into two sub-rules.
As a rule of thumb, a blank final instance must be initialized in all constructors. If you follow
this rule, a blank final instance variable will be initialized multiple times if a constructor
calls another constructor. To avoid multiple initialization of a blank final instance variable, it
should not be initialized in a constructor if the first call in the constructor is a call to another
constructor, which initializes the blank final instance variable.
 */