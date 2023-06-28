
package com.example.slmpruefung;

public class StringModExam {

    private static int lastModifiedWordLength = 0;

    public static String modifyString(String input) {
        StringBuilder output = new StringBuilder();
        boolean capitalize = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (capitalize) {
                    c = Character.toUpperCase(c);
                    capitalize = false;
                } else {
                    capitalize = true;
                }
            }
            output.append(c);
        }

        lastModifiedWordLength = output.length() - lastModifiedWordLength;
        return output.toString();
    }

    public static int getLastModifiedWordLength() {
        return lastModifiedWordLength;
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "world";
        String modifiedString1 = modifyString(input1);
        System.out.println("Modified String: " + modifiedString1);
        System.out.println("Last Modified Word Length: " + getLastModifiedWordLength());
        String modifiedString2 = modifyString(input2);
        System.out.println("Modified String: " + modifiedString2);
        System.out.println("Last Modified Word Length: " + getLastModifiedWordLength());
    }
}