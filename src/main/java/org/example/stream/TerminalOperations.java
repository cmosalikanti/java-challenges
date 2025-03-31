package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        TerminalOperations to = new TerminalOperations();
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 10,9,8,7,6);
        System.out.println("Sorting numbers: " + to.sortTheNumbers(list));
        System.out.println("Print double of numbers");
        to.printDoubleOfEachNumber(list);
    }

    private List<Integer> sortTheNumbers(List<Integer> list) {
        return list.stream().sorted().toList();
    }

    private void printDoubleOfEachNumber(List<Integer> list) {
        list.stream().map(number -> number * 2).forEach(value -> System.out.println(value));
    }
}
