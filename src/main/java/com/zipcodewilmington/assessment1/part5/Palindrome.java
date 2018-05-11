package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input)
    {
        int palindromes = 0;

        for (int i = 0; i < input.length(); i++)
        {
            for (int j = i + 1; j <= input.length(); j++)
            {
                StringBuilder sb = new StringBuilder(input.substring(i,j));

                sb.reverse();

                if(input.substring(i, j).equals(sb.toString()))
                {
                    palindromes++;
                }

            }
        }

        return palindromes;

        //return null;
    }
}
