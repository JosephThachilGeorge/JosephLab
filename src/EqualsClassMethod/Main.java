package EqualsClassMethod;

public class Main {

    public static void main(String[] args) {

        Human name1=new Human(10424,"Joseph");
        Human name2=new Human(10423,"Joseph");

        Human name3=name2;

       // int valueofname1=name1.hashCode();
       // int valueofname2=name2.hashCode();

        //System.out.println(valueofname1+"    "+valueofname2);

        //System.out.println(name1==name2); // double equal check the identity

        boolean valeofobject=name1.equals(name2);  // here it check whether two object are equal, checking reference whether equal or not. result will be false
        System.out.println(valeofobject);

        /*
         boolean valeofobject=name2.equals(name3);  // here it check whether two object are equal, checking reference whether equal or not. result will be true
        System.out.println(valeofobject);

         */


        String str1= new String("Jose");
        String str2=new String("Joseph");

        boolean value= str1.equals(str2); //here it check whether two string object are equal, checking not reference whether content are equal or not. Here result will be false, because str1 has Jose and str2 has Joseph

        System.out.println("String object checking:"+value);


        /*
           String str1= new String("Joseph");
        String str2=new String("Joseph");

        boolean value= str1.equals(str2); //. Here result will be true, because str1 has Joseph and str2 also has Joseph both are same

        System.out.println("String object checking:"+value);
         */







    }


}
