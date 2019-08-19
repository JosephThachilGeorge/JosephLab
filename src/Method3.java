import java.util.Scanner;

public class Method3 {

    public static void main(String[] args) {

        System.out.println("Average of 3 numbers:"+average(10,222,117));
        System.out.println("Average of 3 numbers:"+average(10.5,222,117));
    }


        public static double average (double n1, double n2, double n3)

        {

           return (n1+n2+n3)/3.0;

    }

        public static int average (int n1, int n2, int n3)

        {

            return (n1+n2+n3)/3;

        }

    }