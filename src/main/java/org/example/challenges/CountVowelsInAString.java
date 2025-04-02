package org.example.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountVowelsInAString {
    public static void main(String[] args) {
        countVowelsIn("soudsdsdsa");
    }

    private static void countVowelsIn(String string) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e','i','o', 'u'));

        int vowelCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(string.charAt(i))) {
                vowelCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
    }
}
