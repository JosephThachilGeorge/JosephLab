package ArrayList;

import java.util.ArrayList;

public class Arraylist {


    public static void main(String[] args) {


        ArrayList<String> names= new ArrayList<>();

        names.add("This is my string");
        names.add("Joseph");
        names.add("Meghna");
        names.add("George");

        System.out.print("Initial Size of array"+ names.size());

        for(int i=0;i<names.size();i++)

        {
            System.out.println("Array list are:"+ i+ ":"+ names.get(i));
        }

        names.set(0,"Thachil");

        for(int j=0;j<names.size();j++)

        {
            System.out.println("Array list are:"+ j+ ":"+ names.get(j));
        }

        names.remove(0);
        names.add(0,"Patil");

        for(int k=0;k<names.size();k++)

        {
            System.out.println("Array list are:"+ k+ ":"+ names.get(k));
        }

        //search of an index

        System.out.println( "First Search: " + names.indexOf( "Meghna" ) );



    }
}

