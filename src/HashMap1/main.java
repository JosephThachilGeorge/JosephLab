package HashMap1;

import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("WELCOME TO SERVICE CENTER ");

        Hashstore obj = new Hashstore();

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Customer name:");
        System.out.println("Enter Customer ID:");


        // String input
        String cusname = myObj.nextLine();
        String cusnumber = myObj.nextLine();

        obj.customer.put(cusname,cusnumber);

        System.out.println("name:"+obj.customer);




    }
}
