package Clonemethod;

import java.util.Objects;

public class Human implements Cloneable {

    public int adharnumber;
    public String name;
    public String number;


    public Human(int adharnumber,String name,String number) {
        this.adharnumber=adharnumber;
        this.name=name;
        this.number=number;
    }

    @Override
    public String toString() {
        return adharnumber+name+number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return adharnumber == human.adharnumber &&
                name.equals(human.name) &&
                number.equals(human.number);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Human() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
