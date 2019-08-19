package Listexample;

import java.util.ArrayList;
import java.util.List;

public class Listexample {

    void directory() {
        List<Object> mytelephone = new ArrayList<>();
        mytelephone.add("100");
        mytelephone.add("ANB");
        mytelephone.add(4757);
        mytelephone.add(45755);


        for ( Object telephone : mytelephone)

        {
            //System.out.println(mytelephone);

        }

        System.out.println(mytelephone);

    }

}
