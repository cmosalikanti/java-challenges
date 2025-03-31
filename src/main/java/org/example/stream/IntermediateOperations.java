package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {
    //  filter, map and distinct
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,2);
        IntermediateOperations io = new IntermediateOperations();
        System.out.println(io.getEvenNumbers(numbers));
        System.out.println(io.getTwiceOfEachNumbers(numbers));
        System.out.println(io.getDistinctNumbers(numbers));
    }

    private List<Integer> getDistinctNumbers(List<Integer> numbers) {
        return numbers.stream().distinct().toList();
    }

    private List<Integer> getTwiceOfEachNumbers(List<Integer> numbers) {
        return numbers.stream().map(number -> number * 2).toList();
    }

    private List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).toList();
    }
}
