package org.example.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestAndSmallest {
    public static void main(String[] args) {
        findLargestAndSmallest(Arrays.asList(1,2,3,4,5));
    }

    private static void findLargestAndSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("Smallest: " + numbers.get(0));
        System.out.println("Largest: " + numbers.get(numbers.size() - 1));
    }
}
