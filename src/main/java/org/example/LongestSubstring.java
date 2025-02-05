package org.example;

public class LongestSubstring {
    public static void main(String[] args) {
        String string = "qqqqqqqqqqqasasaszxcvbnmlkjhgfdsaqwertyuiopasdfghjkl;";
        StringBuilder builder = new StringBuilder();

        String longestSubstring = null;
        for (int index = 0; index < string.length(); index++) {
            String charString = String.valueOf(string.charAt(index));
            String builderString = builder.toString();

            if (builderString.contains(charString)) {
                if (builderString.length() > (longestSubstring == null ? 0 : longestSubstring.length())) {
                    longestSubstring = builderString;
                }

                builder = new StringBuilder();
            } else {
                builder.append(charString);
            }
        }

        String finalBuildString = builder.toString();
        if (longestSubstring != null) {
            if (finalBuildString.length() > longestSubstring.length()) {
                longestSubstring = finalBuildString;
            }
        }

        System.out.println(longestSubstring);
    }
}
