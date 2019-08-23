package ValueOfMethod;
//The Difference Between Using Constructors and valueOf( ) Method to Create Integer Objects
public class CachedWrapperObjects {
    public static void main(String[] args) {
        System.out.println("Using the constructor:");

// Create two Integer objects using constructors
        Integer iv1 = new Integer(25);
        Integer iv2 = new Integer(25);
        System.out.println("iv1 = iv1 = " + iv1 + ", iv2 = " + iv2);

// Compare iv1 and iv2 references
        System.out.println("iv1 == iv2: " + (iv1 == iv2));

// Let's see if they are equal in values
        System.out.println("iv1.equals(iv2): " + iv1.equals(iv2));

        System.out.println("\nUsing the valueOf() method:");

// Create two Integer objects using the valueOf()
        Integer iv3 = Integer.valueOf(25);
        Integer iv4 = Integer.valueOf(25);
        System.out.println("iv3 = " + iv3 + ", iv4 = " + iv4);

// Compare iv3 and iv4 references
        System.out.println("iv3 == iv4: " + (iv3 == iv4));

// Let's see if they are qual in values
        System.out.println("iv3.equals(iv4): " + iv3.equals(iv4));
    }
}

/*
Output

Using the constructor:
iv1 = iv1 = 25, iv2 = 25
iv1 == iv2: false
iv1.equals(iv2): true

Using the valueOf() method:
iv3 = 25, iv4 = 25
iv3 == iv4: true
iv3.equals(iv4): true



Notice that iv1 and iv2 are references to two different objects, as iv1 == iv2 returns false. However, iv3 and iv4
are references to the same object, as iv3 == iv4 returns true. Of course, all iv1, iv2, iv3, and iv4 represent the same
primitive value of 25 as indicated by the returned value from the equals() method. Typically, programs use smaller
integer literals. If you are wrapping bigger integers, the valueOf() method creates a new object every time it is called.
 */

