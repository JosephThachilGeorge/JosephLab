package Collections;

//list extends collections features

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listexample {

    public static void main ( String[] args)
    {

        List<Integer> numbers= new ArrayList<>();

        numbers.add(100);
        numbers.add(410);
        numbers.add(902);





        numbers.add(1,300);

         numbers.forEach(System.out::println);
    }
}













