package ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        ArrayList<String> cars= new ArrayList<String>();

        ArrayList<Integer> money =new ArrayList<Integer>();

        cars.add("Volvo");
        cars.add("Jeep");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        cars.set(0, "Opel");

      //  cars.remove(0);   To remove


        money.add(10);
        money.add(200);

        //Collections.sort(money);


        for (String i : cars)

        {
            System.out.println(i);

        }

        System.out.println(cars.size());

        System.out.println(cars);
        System.out.println(money);



    }
}