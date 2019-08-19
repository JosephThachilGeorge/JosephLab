package Thisexample2;

public class Student {

    int id=101;

    int rolnumber=200;

    public void setId(int id) {
        this.id = id;                // if id=id instead of this.id=id then out put will be 101 and 200
    }

    public void setRolnumber(int rolnumber) {
        this.rolnumber = rolnumber;  // if this.rolnumber = rolnumber instead of this.id=id then out put will be 101 and 200
    }

    public int getId() {

        System.out.println(this.id);
        return id;
    }

    public int getRolnumber() {
        System.out.println(this.rolnumber);
        return rolnumber;
    }
}
