package CallingConstructorAnotherConstructor;

import Constructor2.SmartDog;

public class Main {

    public static void main(String[] args) {
        SmartDog dog=new SmartDog("Jo",.00);

        SmartDog dog1=new SmartDog("Puppy",1474);

        dog1.bark();
        dog.bark();

        dog1.setName("Puppy1");
        dog1.setPrice(1014.00);

        dog1.printDetails();

        dog.printDetails();
    }
}
