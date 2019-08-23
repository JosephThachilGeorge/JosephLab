package Clonemethod;

public class Main {
    public static void main(String[] args)

            throws CloneNotSupportedException {


        Human name1=new Human(1454,"Joseph","457555");

        Human name2= new Human(14554,"Jose","457555");

        Human name3 = (Human) name1.clone();  // creating copy of object and it create all value duplicate and store in different reference value


        System.out.println("Orginal:"+name1);
        System.out.println("Orginal hashcode:"+name1.hashCode()); //different reference value

        System.out.println("Cloned:"+ name3);
        System.out.println("Orginal hashcode:"+name3.hashCode()); //different reference value



    }


/*
Output:

Orginal:1454Joseph457555
Orginal hashcode:1846274136
Cloned:1454Joseph457555
Orginal hashcode:1639705018

same valus but reference is different
 */



}
