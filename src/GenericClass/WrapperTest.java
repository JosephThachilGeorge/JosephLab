package GenericClass;

public class WrapperTest {

    public static class Wrapper<T> {
// Code for the Wrapper class goes here


            private T obj;

            public Wrapper(T obj) {
                this.obj = obj;
            }

            public T get() {
                return obj;
            }

            public void set(T obj) {
                this.obj = obj;
            }
        }


    public static void main(String[] args) {

        Wrapper<String> w1 = new Wrapper<>("Hello");
        String s1 = w1.get();
        System.out.println("s1=" + s1);

        w1.set("Testing generics");
        String s2 = w1.get();
        System.out.println("s2=" + s2);

        w1.set(null);
        String s3 = w1.get();
        System.out.println("s3=" + s3);
    }
}

