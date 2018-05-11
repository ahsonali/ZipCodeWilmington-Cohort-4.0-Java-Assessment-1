package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.UnitTestingUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtilsTest {
    @Test
    public void getNumberOfOccurrencesTest1() {
        // Given
        Object valueToEvaluate = 7;
        Object expected = 3;
        Object[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Object actual = ArrayUtils.getNumberOfOccurrences(inputArray, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeValueTest1() {
        // Given
        Integer valueToRemove = 7;
        Integer[] expected = {1, 2, 8, 4, 5, 0, 9, 8};
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Object[] actual = ArrayUtils.removeValue(inputArray, valueToRemove);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void getMostCommonTest() {
        // Given
        Object expected = 7;
        Object[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Object actual = ArrayUtils.getMostCommon(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLeastCommonTest() {
        // Given
        Integer expected = 2;
        Integer[] inputArray = {1,1,2,3,3,3,4,4,4,4};

        // When
        Object actual = ArrayUtils.getLeastCommon(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mergeArraysTest() {
        // Given
        Integer[] array1 = {1,1,1,2,2,2};
        Integer[] array2 = {3,3,3,4,4,4};
        Integer[] expected = {1,1,1,2,2,2,3,3,3,4,4,4};

        // When
        Integer[] actual =  ArrayUtils.mergeArrays(array1, array2);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }
}
