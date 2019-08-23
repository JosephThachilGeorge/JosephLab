package FinalizeObjectClass;

import Final.FinalLocalVariables;

public class Finalize {

            private int x;

        public Finalize(int x) {
            this.x = x;
        }

        public void finalize() {
            System.out.println("Finalizing " + this.x);

            /* Perform any cleanup work here... */
        }

    public static void main(String[] args) {

       Finalize Fi= new Finalize(100);

       Fi.finalize();

    }

}

/*
The garbage collector calls the finalizer for each object only once. Running a finalizer for an object does not
necessarily mean that the object will be destroyed immediately after the finalizer finishes. A finalizer is run when the
garbage collector determines that no reference exists for the object. However, an object may pass its own reference
to some other part of the program when its finalizer is run. This is the reason that the garbage collector checks one
more time after it runs an object’s finalizer to make sure that no references exists for that object and then it destroys
(de-allocates memory) the object. The order in which finalizers are run and the time at which they are run are not
specified. It is not even guaranteed that a finalizer will run at all. This makes it undependable for a programmer to
write cleanup logic in the finalize() method. There are better ways to perform cleanup logic, for example, using
a try-finally block. It is suggested not to depend on the finalize() method in your Java program to clean up
resources uses by an object.
 */