package org.example.challenges;

public class ReverseAString {
    public static void main(String[] args) {
        String orginalString = "A man, a plan, a canal, Panama!";
        System.out.println("Original String:" + orginalString);
        System.out.println("String in reverseOrder: " +reverseTheString(orginalString));
        System.out.println(orginalString + " is palindrome?:" +  isPalindrome(orginalString));
    }

    private static boolean isPalindrome(String orginalString) {
        String formattedOriginalString= orginalString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("formattedOriginalString " + formattedOriginalString);
        StringBuilder reverseBuilder = new StringBuilder(formattedOriginalString);
        String reversedString = reverseBuilder.reverse().toString();

        boolean isPalindrome = false;
        if (formattedOriginalString.toLowerCase().equals(reversedString)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }

    private static String reverseTheString(String orginalString) {
        StringBuilder reverseBuilder = new StringBuilder(orginalString);
        return reverseBuilder.reverse().toString();
    }
}