package StaticandNonStaticmethos;

public class Methodtype {

    static int n1=200;

    int n2=300;

    static void staticmethod() {

        System.out.println("Static varaible"+n1);
        //System.out.println("non static varriable:"+n2);

        /* We can refer to only static variable m in this method
because you are inside a static method */

        }

        void nonstaticmethod() {

            System.out.println("Static varriable"+n1);
            System.out.println("non static varriable"+n2); /* We can refer to both static and instance variables m and n in this method */
        }


}
