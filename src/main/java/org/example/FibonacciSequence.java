package org.example;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number N to generate Fibonacci sequence: ");
        int givenNumber = scanner.nextInt();

        // Call function to print Fibonacci sequence up to Nth number
        printFibonacci(givenNumber);
        scanner.close();
    }

    private static void printFibonacci(int givenNumber) {
        if (givenNumber <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        int first = 0;
        int second = 1;
        int next;

        for (int index = 0; index <= givenNumber; index++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
