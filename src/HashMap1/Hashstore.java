package HashMap1;

import java.util.HashMap;

public class Hashstore {

    HashMap<String, String> customer = new HashMap<>();

    public void addInMap(String cusname, String cusnumber) {

        if (customer == null) {
            customer = new HashMap<String, String>();
            customer.put(cusname, cusnumber);

            return;
        }


    }
}