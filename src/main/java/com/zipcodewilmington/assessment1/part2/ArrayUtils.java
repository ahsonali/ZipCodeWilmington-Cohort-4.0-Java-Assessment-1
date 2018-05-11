package com.zipcodewilmington.assessment1.part2;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)
    {
        Integer count = 0;
        for (int i = 0; i < objectArray.length; i++)
        {
            if (objectArray[i].equals(objectToCount))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove)
    {
        int count = getNumberOfOccurrences(objectArray, objectToRemove);
        Integer objectArraylength = objectArray.length;
        int goodValues = 0;

        Integer size = objectArraylength - count; //getNumberOfOccurrences(objectArray, objectToRemove);
        Object [] objects;
        objects = Arrays.copyOf(objectArray, size);

        //objects array is still empty but has a size shorter than original
        //object array

        int j = 0;

        //Loop through each index of object array
        for (int i = 0; i < objectArray.length; i++)
        {
            //if index is equal to object to remove, count it.
            if (!objectArray[i].equals(objectToRemove))
            {
                objects[j] = objectArray[i];
                j++;

            }
        }
//
        return objects;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray)

    {

        Integer count = 0;
        Object obj = null;

        for (int i = 0; i < objectArray.length; i++)
        {
            Integer n = getNumberOfOccurrences(objectArray, objectArray[i]);
            if (n > count)
            {
                count = n;
                obj = objectArray[i];
            }
        }
        return obj;



    }

//    b




    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray)
    {
        Integer count = objectArray.length;
        Object obj = null;

        //Could've created an array list and a for each loop
        for (int i = 0; i < objectArray.length; i++)
        {
            Integer n = getNumberOfOccurrences(objectArray, objectArray[i]);

            //If n is less than the count, the count becomes n
            if (n < count)
            {
                //Count changes here
                count = n;
                obj = objectArray[i];
            }

        }

        return obj;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    //public static [] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd)
    //{
        //return null;
    //}

    public static <T> T[] mergeArrays(T[] objectArray, T[] objectArrayToAdd) {

        T[] resultOfMergingTwoArrays = Arrays.copyOf(objectArray,
                objectArray.length + objectArrayToAdd.length);

        System.arraycopy(objectArrayToAdd, 0, resultOfMergingTwoArrays,
                objectArray.length, objectArrayToAdd.length);

        return resultOfMergingTwoArrays;
}}
