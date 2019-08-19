package Constructor;
public class Student {

String name;
int id;
  int  rollnumber;
  int schollid;
  String Serialname;

    public Student()

    {

     System.out.println("This is my constructor example with no parameter:");
     name="Joseph";
     id=100;

    }

    public Student(int studentrol)

    {

        System.out.println("This is my constructor example with parameter:");
        rollnumber=studentrol;

    }

    public Student(int idno, String arg)

    {

        System.out.println("This is my constructor example with two parameters:");
        schollid=idno;
        Serialname=arg;

    }


    public void introduce ()

    {
        System.out.println("name is :"+name + "id is :" +id+ "Student Roll number:"+rollnumber+ "School id:"+ schollid+"Serialnameof school:"+Serialname);
    }


}
