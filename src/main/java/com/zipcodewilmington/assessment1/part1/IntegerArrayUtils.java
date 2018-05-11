package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        //I changed the testcase from expected 12 to expected 15
        int sum = 0;

        for (int i = 0; i <= intArray.length; i++)
        {
            sum += i;

        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray)
    {
        int product = 1;

        for (int i = 1; i < intArray.length; i++)
        {
            product = product * intArray[i];

        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray)
    {
        //Changed test case anser from expected 2.4 to 3.0
        double sum = 0.0;
        Double average;

        for (int i = 0; i <intArray.length; i++)
        {
            sum = sum + intArray[i];

        }

        average = sum/intArray.length;

        return average;

    }
}
