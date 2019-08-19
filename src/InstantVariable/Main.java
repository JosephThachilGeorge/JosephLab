package InstantVariable;

public class Main {

    public static void main(String[] args) {

        Instantvarabile dis=new Instantvarabile();

        // Print the default values for all instance variables

        System.out.println("int is initialized to" + dis.l);
        System.out.println("byte is initialized to" + dis.p);
        System.out.println("char is initialized to" + dis.c);
        System.out.println("float is initialized to" + dis.s);
        System.out.println("double initialized to" + dis.d);
        System.out.println("long is initialized to" + dis.a);
        System.out.println("short is initialized to" + dis.r);
        System.out.println("String is initialized to" + dis.m);




    }
}


/*

   int l;
   byte p;
   char c;
   float s;
   double d;
   long a;
   short r;
   String m;
   Boolean k;

  output
int is initialized to0
byte is initialized to0
char is initialized to
float is initialized to0.0
double initialized to0.0
long is initialized to0
short is initialized to0
String is initialized tonull

 */