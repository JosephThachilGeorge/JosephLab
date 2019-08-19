package This.Exam1.Exam2;

public class Thisstatic {

    static int varA=100;
    static int varB=varA;
    static int varC=varA;  // static int varC=Thisstatic.varA; this will work! instead of static int varC=varA;

    // static int varC=this.varA; this will not work

    static  void display()
    {

        System.out.println(varC);
    }


}

/*

public class Thisstatic  {
    int varA = 555;
    static int varB = varA; // A compile-time error
    static int varC = varA; // A compile-time error


}

Most of the time you can use the simple name of instance and class variables within the class in which they are
declared. You need to qualify an instance variable with the keyword this and a class variable with the class name only
when the instance variable or the class variable is hidden by another variable with the same name

 */
