import java.util.Scanner;


public class calculator {


    public static void main(String[] args) {


        int a, b;

        String operation;


        System.out.println("Enter first number:");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        System.out.println("Enter second number:");
        Scanner sc = new Scanner(System.in);
        b = scan.nextInt();

        System.out.println("Enter your operation");

        operation = scan.next();

        if (operation.equals("+")) {

            System.out.println("Sum of the numbers:" + (a + b));
        } else if (operation.equals("-")) {
            System.out.println("Substaraction of the numbers:" + (a - b));
        } else if (operation.equals("*")) {
            System.out.println("Substaraction of the numbers:" + (a * b));
        }


    }
}


