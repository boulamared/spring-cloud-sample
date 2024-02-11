package com.tinkeraft.memberservice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestCommonString {

    static String searchingChallenge(String str) {
        int count = 0;

        for (int x = 0; x < str.length(); x++) {
            StringBuilder num = new StringBuilder();
            int tempCount = 0;

            while (x < str.length() && Character.isDigit(str.charAt(x))) {
                num.append(str.charAt(x));
                x++;
            }

            try {
                int temp = Integer.parseInt(num.toString());
                if (temp % 2 == 0) {
                    tempCount++;
                }
            } catch (NumberFormatException ignored) {
            }

            count = Math.max(count, tempCount);
        }

        return count >= 2 ? "true" : "false";
    }


    public static void main(String[] args) {
        String str3 = "3gy41d216";
        String str4 = "f09r27i8e67";

        System.out.println(searchingChallenge(str3)); // Output: true
        System.out.println(searchingChallenge(str4));  //Output: false
    }
}
