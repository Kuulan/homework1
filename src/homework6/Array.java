package homework6;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] firstArray = new int[10];

        int maxInt = 0;
        int minInt = 0;
        int sumInt = 0;
        ArrayList<Integer> evenArray = new ArrayList<>();


        for (int i = 0; i < firstArray.length; i++) {
            int s = (int) (Math.random() * 100);
            firstArray[i] = s;

            sumInt += s;

            if (maxInt < s) {
                maxInt = s;
            }

            if (minInt == 0) {
                minInt = s;
            }

            if (minInt > s) {
                minInt = s;
            }

            if (s % 2 == 0) {
                evenArray.add(s);
            }
        }

            System.out.println("Array");
            System.out.println(Arrays.toString(firstArray));
            System.out.println("maxInt");
            System.out.println(maxInt);
            System.out.println("minInt");
            System.out.println(minInt);
            System.out.println("sumInt");
            System.out.println(sumInt);
            System.out.println("evenArray");
            System.out.println(Arrays.toString(evenArray.toArray()));

    }
}


