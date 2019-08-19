package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionex {


    public static void main(String[] args) {

        Collection value = new ArrayList();


        //
//In collection we can specify generic like integer or string

        Collection<Integer> id = new ArrayList<Integer>();



        value.add(6);
        value.add("Love");
        value.add("Kind");
        value.add("Spritual");

        id.add(10);
        id.add(100);

        for (Object i : value)

        {
            System.out.println("Qualites are : " + i);

        }

        for (Object j : id)

        {
            System.out.println("ID is : " + j);

        }



    }
}

//In collection we can specify generic like integer or string



//Collection will not have index. simply storing


