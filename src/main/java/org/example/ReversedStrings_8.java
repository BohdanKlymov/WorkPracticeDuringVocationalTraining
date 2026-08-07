package org.example;

public class ReversedStrings_8 {
    static void main() {
        System.out.print(solution("World Cup"));
    }

    public static String solution(String str) {

        StringBuilder result = new StringBuilder();

        for (int index = str.length() - 1; index > -1; index--) {
            result.append(str.charAt(index));
        }
        return result.toString();
    }
}
