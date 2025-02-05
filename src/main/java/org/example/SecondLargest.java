package org.example;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String a[]) {
        new SecondLargest().findSecondLargest(Arrays.asList(1,2,3,4,5));
    }

    private Integer findSecondLargest(List<Integer> numbers) {
        int second = Integer.MIN_VALUE; //  0
        int first = Integer.MIN_VALUE;  //  10

        for (int number: numbers) {
            if (number > first) {
                second = number;
                first = number;
            } else if (number > second && number < first) {
                second = number;
            }
        }

        System.out.println(second);
        System.out.println(first);
        return second;
    }
}
