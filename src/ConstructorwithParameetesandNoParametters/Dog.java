/*
The first statement uses the constructor with no parameters and the second one uses the constructor with a
String parameter.
 */

package ConstructorwithParameetesandNoParametters;

public class Dog {

    // Constructor #1

     Dog(){

         System.out.println("A dog is created.");
    }

    // Constructor #2

     Dog(String name){

        System.out.println("A dog is created and Name is."+name);

    }
}
