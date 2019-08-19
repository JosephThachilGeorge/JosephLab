package Encapsulation;

public class Myclass {

    public static void main(String[] args) {

        Main obj1= new Main();

        obj1.setId(10011);
        obj1.setBio("Electronics");
        obj1.setRollnumber(60606060);
        obj1.setName("Meghna");

       System.out.println(obj1.getId()+obj1.getRollnumber()+obj1.getBio()+obj1.getName());


    }
}


