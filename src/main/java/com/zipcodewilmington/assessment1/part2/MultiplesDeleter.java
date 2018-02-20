package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints)
    {
        //I'd typically do this using an arrayList

        /*My if statement is finding what is odd
        and putting it into an array. Unfortunately my
        go to code is spaghetti*/



        Integer[] odds = new Integer[0];

        for (int i = 0; i < ints.length; i++)
        {
            if (ints[i] % 2 != 0)
            {
                ints[i] = odds[i];
            }

        } return odds;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] evens = new Integer[0];



        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i] = evens[i];
            }
        } return evens;
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints)
    {
        Integer [] multiplesOfThree = new Integer[0];

        for (int i = 0; i < ints.length; i++)
        {
            if (ints[i] % 3 != 0)
            {
                ints[i] = multiplesOfThree[i];
            }
        } return multiplesOfThree;

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple)
    {
        return null;
    }
}
