package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */

    //doesn't pass
    public Integer[] deleteEvens(Integer[] ints)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer index: ints)
        {
            if (!(index % 2 == 0)) // -> odd
            {
                result.add(index);
            }
        }

        return result.toArray(new Integer[result.size()]);
//

    }

//    public Integer [] deleteEvens2(Integer [] ints)
//    {
//        Integer [] newIntegerArray = new Integer[ints.length];
//        Integer [] nonNullIntegerArray = new Integer[newIntegerArray.length];
//
//        int j = 0;
//
//        for (int i = 0; i < ints.length; i++)
//        {
//            if (ints[i] % 2 == 1)
//            {
//                newIntegerArray[j] = ints[i];
//                j++;
//            }
//        }
//
//        for (int i = 0; i < newIntegerArray.length; i++)
//        {
//            if (newIntegerArray[i] != null)
//            {
//                nonNullIntegerArray[j] = newIntegerArray[i];
//                j++;
//            }
//        }
//
//        return nonNullIntegerArray;
//
//
//    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer index: ints)
        {
            if (index % 2 == 0) // -> odd
            {
                result.add(index);
            }
        }

        Integer [] newArray = result.toArray(new Integer[result.size()]);

        return newArray;
        //return result.toArray(new Integer[result.size()]);



    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer index : ints)
        {
            if (index % 3 != 0)
            {
                result.add(index);
            }
        }
        return result.toArray(new Integer[result.size()]);

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer index : ints)
        {
            if (index % multiple != 0)
            {
                result.add(index);
            }
        }

        return result.toArray(new Integer[result.size()]);
    }
}
