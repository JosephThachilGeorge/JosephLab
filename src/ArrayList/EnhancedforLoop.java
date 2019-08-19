//Compare two arraylists – find common elements

package ArrayList;

import java.util.ArrayList;

public class EnhancedforLoop {

    public static void main ( String[] args)
    {
       ArrayList<String> names= new ArrayList<>();

        ArrayList<String> job= new ArrayList<>();


        names.add( "Amy" );    names.add( "Bob" );
        names.add( "Chris" );  names.add( "Deb" );
        names.add( "Elaine" ); names.add( "Frank" );
        names.add( "Gail" );   names.add( "Hal" );

        job.add( "jo" );    job.add( "Bob" );
        job.add( "jomm" );  job.add( "dark" );
        job.add( "Elaine" ); job.add( "Frank" );
        job.add( "Gail" );   job.add( "la" );


        for (String mn: names) {

            System.out.println("Your Arry list contains:" + mn);
        }

//Compare two arraylists – ptint same

        names.retainAll(job);

        System.out.println( names);

    }
}

// https://howtodoinjava.com/java/collections/arraylist/compare-two-arraylists/


   // Compare two arraylists – find missing elements
//remove all elements from second list
      //  job.removeAll(names);



// Compare two arraylists – find additional elements

//names.removeAll(job);

