package ClassMemberAccessibility;

public class AccessLevelSample {

    private int n1=100;      // private access level
    int n2=200;              // package-level access
    protected int n3=300;    // protected access level
    public int n4=400;       // public access level
    static int n5=500;


    // m1() method has private access level
    private void m1(){

        System.out.println("private void m1");
        System.out.println("private access level n1:"+n1);
        System.out.println("package-level access n2:"+n2);
        System.out.println("protected access level n3:"+n3);
        System.out.println("package-level access n4:"+n4);
        System.out.println("public static:"+n5);
        System.out.println("*****************************");



    }


    // m2() method has package-level access
    void m2(){

        System.out.println("void m2");
        System.out.println("private access level n1:"+n1);
        System.out.println("package-level access n2:"+n2);
        System.out.println("protected access level n3:"+n3);
        System.out.println("package-level access n4:"+n4);
        System.out.println("public static:"+n5);
        System.out.println("*****************************");


    }

    // m3() method has protected access level

    protected void m3(){

        System.out.println("protected void m3");
        System.out.println("private access level n1:"+n1);
        System.out.println("package-level access n2:"+n2);
        System.out.println("protected access level n3:"+n3);
        System.out.println("package-level access n4:"+n4);
        System.out.println("public static:"+n5);
        System.out.println("*****************************");


    }

    // m4() method has public access level
    public void m4()
    {
        System.out.println("public void m4");
        System.out.println("private access level n1:"+n1);
        System.out.println("package-level access n2:"+n2);
        System.out.println("protected access level n3:"+n3);
        System.out.println("package-level access n4:"+n4);
        System.out.println("public static:"+n5);
        System.out.println("*****************************");

    }

    static void m5(){

        System.out.println("public void m4");//System.out.println("private access level n1:"+n1); not possible
       // System.out.println("package-level access n2:"+n2); not possible
       // System.out.println("protected access level n3:"+n3); not possible
       // System.out.println("package-level access n4:"+n4); not possible
        System.out.println("public static:"+n5);
        System.out.println("*****************************");

    }

    public static void main(String[] args) {

        AccessLevelSample ne=new AccessLevelSample();


        ne.m1(); //possible
        ne.m2(); //possible
        ne.m3(); //possible
        ne.m4(); //possible
        AccessLevelSample.m5(); //possible!!!  TO CALL  static void m5, we need to call with class name.



    }


}
