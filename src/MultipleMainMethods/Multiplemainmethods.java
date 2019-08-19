package MultipleMainMethods;

public class Multiplemainmethods {

    public static void main(String[] args) {
        /* May be used as the application entry point */
    }

    public static void main(String[] args, int a) {
        /* Another main() method */
    }

    public int main() {
        /* Another main() method */
        return 0;
    }
}

/*
The main() method in a class, which is declared as public static void main(String[] args) , has a special
meaning only when the class is run by the JVM. It serves as an entry point for the Java application. Otherwise, the main()
method is treated the same as any other class methods.
 */
