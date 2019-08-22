package EqualsClassMethod;

import java.util.Objects;

public class Human {

    public int Adharnumber;
    public String name;


    public Human(int Adharnumber, String name){

        this.Adharnumber=Adharnumber;
        this.name=name;

        return;



    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Adharnumber == human.Adharnumber && // here it check both adhar and name
                name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Adharnumber, name);
    }
    /*
 */
}

