package InvokingmethodEXAMPLE;

public class Main {

    public static void main(String[] args) {



        // Create an instance of Invokingmethod class and
       // store its reference in mt reference variable
        Invokingmethod method=new Invokingmethod();




     // Invoke the printmethod() instance method using the method reference variable
        method.printmethod(); // // This is called Invoke the instance method


       /*
       To invoke a class method, you use dot notation with the class name. The following snippet of code invokes the
method() class method of the MethodType class:
        */
        // Invoke the method() class method
        Invokingmethod.method();  // This is called  Invoke the class method using the class name
        
        



    }

   void method() {

       Main mt=new Main();

       mt.method();
    }


}







/*output

        /usr/lib/jvm/java-8-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/163/lib/idea_rt.jar=44799:/snap/intellij-idea-community/163/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/joseph/workspaces/josephlab/out/production/josephlab InvokingmethodEXAMPLE.Main
        Value of n:10
        value of m:200
        value of m:200


        Process finished with exit code 0 */
