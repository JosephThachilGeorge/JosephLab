public class Main1 {

    public static void main(String[] args) {

        String name= "Joseph";
        int num=10;
        String myname="Joseph T George";
        Character leng='D';

        String firstname="Joseph";
        String lastname="George";
        Float numid = 4.666f;
        double d1 = 12E4d;

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        String fullname=firstname+lastname;

        int x=10, y=100, z=200;

        System.out.println(name);
        System.out.println(num);
        System.out.println(myname);
        System.out.println(leng);
        System.out.println(fullname);
        System.out.println(x+y+z);
        System.out.println(numid);
        System.out.println(d1);
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);


        //Widening Casting

        int num1=10;
        double mynum=num1;
        System.out.println(num1);
        System.out.println(mynum);


        //Narrowing Casting


        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9


        String inta ="JosephMeghna";

        System.out.println("length="+inta.length());
        System.out.println("length="+inta.toUpperCase());
        System.out.println("length="+inta.toLowerCase());
        System.out.println(inta.indexOf("Meghna"));
        System.out.println(Math.max(200,400));
        System.out.println(Math.min(200,400));



    }

}


