package VariableLengthArguments;

public class Main {

    public static void main(String[] args) {
        int[] num1 = new int[] {10, 1};
        int max1 = MathUtil.max(num1);

        int[] num2 = new int[] {10, 8, 18} ;
        int max2 = MathUtil.max(num2);

        System.out.println(MathUtil.max(num1));
        System.out.println(MathUtil.max(num2));
    }
}
