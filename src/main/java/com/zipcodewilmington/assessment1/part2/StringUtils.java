package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String [] array = sentence.split(" ");


        return array;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        //String [] array = sentence.split(" ");
        String firstWord = getWords(sentence)[0];

        return firstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

//        String[] array = sentence.split(" ");
//        String firstWord = array[0];
//
//        StringBuilder sb = new StringBuilder(firstWord);
//
//        String reversed = sb.reverse().toString();
//
//        return reversed;

        String firstWordToReverse = getFirstWord(sentence);
        StringBuilder sb = new StringBuilder(firstWordToReverse);
        String firstWordNowReversed = sb.reverse().toString();

        return firstWordNowReversed;


    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {


//        String[] anArray = sentence.split(" ");
//        String theFirstWord = anArray[0];
//
//        StringBuilder sb = new StringBuilder(theFirstWord);
//
//        String reversed = sb.reverse().toString();
//
//        String theCapitalLetter = reversed.substring(0, 1).toUpperCase();
//
//        String theSuffix = reversed.substring(1, reversed.length());
//
//        return theCapitalLetter + theSuffix;
//    }

        String firstWordToReverseThenCapitalize = reverseFirstWord(sentence);
        String capital = firstWordToReverseThenCapitalize.substring(0, 1).toUpperCase();
        String suffix = firstWordToReverseThenCapitalize.substring(1);
        String result = capital + suffix;

        return result;

    }
//
//        for (int i = 0; i <= sentence.length(); i++)
//        {
//            if (firstWordToReverseThenCapitalize.substring(0,1).equals(firstWordToReverseThenCapitalize.substring(0, 1).toUpperCase()))
//            {
//                return firstWordToReverseThenCapitalize.substring(0,1).toLowerCase() + suffix;
//
//            }
//            else if (firstWordToReverseThenCapitalize.substring(0,1).equals(firstWordToReverseThenCapitalize.substring(0, 1).toLowerCase()))
//            {
//                return firstWordToReverseThenCapitalize.substring(0, 1).toUpperCase() + suffix;
//
//            }
//        }
//
//        return null;
//    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index)
    {
        //String firstHalf = str.substring(0, index).toString();
        //String secondHalf = str.substring(index + 1, str.length()).toString();

        String firstHalf = str.substring(0, index);
        String secondHalf = str.substring(index + 1, str.length());


        return firstHalf + secondHalf;

        //char [] anArray = str.toCharArray();


    }

}
