
import java.util.Scanner;

public class Swith {
    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();

        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        //string

        String[] cars = {"Joseph", "Jose", "Meghna"};

        System.out.println(cars[0]);

        //String replacement

        String[] newcar = {"Volvo", "BMW", "Ford", "Mazda"};
        newcar[0] = "Opel";
        System.out.println(newcar[0]);

        //Array

        int[][] myNumbers = {{1, 2, }, {5, 6, 7}};
        for (int k = 0; k < myNumbers.length; ++k) {
            for (int j = 0; j < myNumbers[k].length; ++j) {
                System.out.println(myNumbers[k][j]);

            }
        }

    }
}











































