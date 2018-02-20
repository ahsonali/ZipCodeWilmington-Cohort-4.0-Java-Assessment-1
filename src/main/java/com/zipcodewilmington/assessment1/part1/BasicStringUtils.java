package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

     Character firstLetter = str.charAt(0);
     String firstWordCapital = firstLetter.toString().toUpperCase();
     String suffix = str.substring(1);

     return firstWordCapital + suffix;






    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder sb = new StringBuilder();


        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str)
    {
        String reverseIt = reverse(str);
        String upperCase = reverseIt.substring(0,1).toUpperCase();
        String suffix = reverseIt.substring(1);

        return upperCase + suffix;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {


        String aString = str.substring(1, str.length()-1);
        return aString;





    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {


        char [] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++)
        {
            if (Character.isUpperCase(charArray[i]))
            {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            else if (Character.isLowerCase(charArray[i]))
            {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }


        } str = new String(charArray);

        return str;





    }
}
