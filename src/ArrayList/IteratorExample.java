package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {

    public static void main ( String[] args)
    {
        // Create and populate the list
        ArrayList<String> names = new ArrayList<String>();
        names.add( "Amy" );    names.add( "Bob" );
        names.add( "Chris" );  names.add( "Deb" );
        names.add( "Elaine" ); names.add( "Frank" );
        names.add( "Gail" );   names.add( "Hal" );

        // Create an iterator for the list
        Iterator<String> iter = names.iterator();

        // Use the iterator to visit each element
        while ( iter.hasNext() )
            System.out.println( iter.next() );

    }
}


/*ArrayList implements the Iterable interface. iterator() is the only method in this interface.

        An iterator object is used to visit the elements of a list one by one. It visits only the cells that have data (so you don't need to worry about going past the end of data). This is more convenient than writing a loop. An iterator implements the Iterator<E> interface, which has the following methods:


        boolean hasNext()    // Returns true if not all elements have been visited

        E next()             // Returns the next element of the list,
        // a reference to type E

        void remove()        // Remove from the list the element just returned by next()*/
