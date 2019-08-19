// Example Hashset and TreeSet

package Setexample;

import java.util.*;

public class Setexample {


        public static void main ( String[] args)
        {

          Set<Integer> numbers= new HashSet<>(); // This just print not order vise , Soring values in Heap memory and feaching randomely

           // Set<Integer> numbers= new TreeSet<>();  This will print in order vise

            numbers.add(100);
            numbers.add(410);
            numbers.add(902);
            numbers.add(909);
            numbers.add(100);
            numbers.add(102);

            numbers.forEach(System.out::println);
        }
    }

