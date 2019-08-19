package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Map.*;

public class Hashmapexample

            {
                public static void main(String[] args) throws CloneNotSupportedException
                {
                    HashMap<Integer, String> map = new HashMap<>();
                    HashMap<String,Integer>  map1 = new HashMap<>();

                    map1.put("47", 4);
                    map1.put("sjo",478);

                    map.put(2,  "A");
                    map.put(3,  "B");
                    map.put(4,  "C");

                    map.get(2);

                    System.out.println( map.get(2));
                    System.out.println( map);
                }
            }


            /*
            First it will create linkedlist and assigne hashcode , then hashcode will create a index . then value will be stored in index.
             */

    /*HashMap cannot contain duplicate keys.
        HashMap allows multiple null values but only one null key.
        HashMap is an unordered collection. It does not guarantee any specific order of the elements.
        HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap. Or you can use Collections.synchronizedMap(hashMap) to get the synchronized version of HashMap.
        A value can be retrieved only using the associated key.
        HashMap stores only object references. So primitives must be used with their corresponding wrapper classes. Such as int
        will be stored as Integer.
        HashMap implements Cloneable and Serializable interfaces.*/
