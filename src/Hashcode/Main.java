package Hashcode;

public class Main {

    public static void main(String[] args) {

        Human ne=new Human();
        ne.name="Joseph";
        ne.Addharnumber=1014575;   // each object will have unic hashcode
        System.out.println(ne.hashCode());



        Human ne1=new Human();
        ne1.Addharnumber=10000;
        ne1.name="Jose";
        System.out.println( ne1.hashCode());

        String Jose=new String("Joseph T");
        String Jose1=new String("Joseph T");

        System.out.println(Jose.hashCode()+"\n"+ Jose1.hashCode());

        /*
        output is same. that means hascode may same some time but object will be different.
        1058295005
        1058295005

         */




    }
}

/*
Output
/.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/joseph/workspaces/josephlab/out/production/josephlab Hashcode.Main
1846274136
1639705018
*/