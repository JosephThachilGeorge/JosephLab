//Sorting elements based on last digit

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparatorexample {

    public static void main ( String[] args)
    {

        List<Integer> numbers= new ArrayList<>();

        numbers.add(100);
        numbers.add(410);
        numbers.add(902);
        numbers.add(909);
        numbers.add(90);
        numbers.add(102);
//Sorting elements based on last digit

        Collections.sort(numbers,(o1, o2)->
                {
                return o1%10>o2%10?1:-1;
    });



        numbers.add(1,300);

        numbers.forEach(System.out::println);
    }
}




