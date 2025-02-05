package org.example;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "Hello, World!";

        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindrome(str1));
    }

    private static boolean isPalindrome(String testString) {
        String formattedOriginalString= testString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = formattedOriginalString.length() - 1;

        for(int index = 0; index == right; index++) {
            if(formattedOriginalString.charAt(left) != formattedOriginalString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
