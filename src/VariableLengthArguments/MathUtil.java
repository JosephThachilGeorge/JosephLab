package VariableLengthArguments;

public class MathUtil {

    public static int max(int[] num){
        /* Must check for zero element in num here */

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }


    }

