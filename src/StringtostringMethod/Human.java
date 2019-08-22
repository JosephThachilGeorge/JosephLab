package StringtostringMethod;

import java.util.Objects;

public class Human {
    public int adharnumber;
    public String name;

    public Human(int adharnumber,String name) {
        super();
        this.adharnumber=adharnumber;
        this.name=name;
    }

    @Override
    public String toString() {
        return adharnumber+name;
    }
}

