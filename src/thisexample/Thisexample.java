package thisexample;

public class Thisexample {

    int varA=2454787;
    int varB=varA;
    int varC=this.varA;

}


/*
// Would not compile
public class Thisexample{
static int varA = 555;
static int varB = varA;
static int varC = this.varA; // A compile-time error
}

When you compile the code for the class ThisTest2, you receive the following compiler error:

"ThisTest2.java": non-static variable this cannot be referenced from a static context at line 4,
column 21

The compiler error is loud and clear that you cannot use the keyword this in a static context. Note that static and
non-static words are synonymous with “class” and “instance” terms in Java. Static context is the same as class context
and non-static context is the same as instance context. The above code can be corrected by removing the qualifier
this from the initialization expression for varW, as follows:

public class CorrectThisTest2 {
static int varU = 555;
static int varV = varU;
static int varW = varU; // Ok this will work
 */