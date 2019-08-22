package Hashcode;

public class Human {

    public int Addharnumber;
    public String name;


    public void Human(int addharnumber,String name){


        this.Addharnumber=Addharnumber;
        this.name=name;

        return;
    }

// using below overide method we can define hashcode , here i define hashcode as Addharnumber
    @Override
    public int hashCode() {
        return Addharnumber;
    }
}
