package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String string = string1 + string2;
        return string;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        if (string1 == null) {
            return string1;
        }

        String output = "";

        for (int i = string1.length() - 1; i >= 0; i--) {
            output = output + string1.charAt(i);
        }

        return output;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        if (string1 == null) {
            return string1;
        }

        String output = "";

        for (int i = string1.length() - 1; i >= 0; i--) {
            output = output + string1.charAt(i);
        }

        if (string2 == null) {
            return string2;
        }

        for (int i = string2.length() - 1; i >= 0; i--) {
            output = output + string2.charAt(i);
        }
        String outputt = "";

        return output;

    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        for (int i = 0; i < string.length() - 1; i++) {
            int n = 0;
            while (n == i) {
                string = string.replaceFirst(String.valueOf(string.charAt(i)), "");
            }
        }
        return string;
    }


    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
   public static String removeCharactersThenReverse(String string, String charactersToRemove){
                return null;
            }}