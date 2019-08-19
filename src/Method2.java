import java.util.Scanner;
public class Method2 {

    public static void main(String[] args) {


        double avg;
        double x,y,z;
        System.out.println("Enter 3 numbers:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();
        z = scan.nextDouble();

        avg = average( x, y, z );

        System.out.println("Average of 3 numbers are:" + avg);

            }

    public static double average(double n1, double n2, double n3) {

        double avg = (n1 + n2 + n3) / 3;
        {
            return avg;

        }

    }
}




