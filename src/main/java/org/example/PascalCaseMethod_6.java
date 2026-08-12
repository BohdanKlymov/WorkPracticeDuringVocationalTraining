package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalCaseMethod_6 {
    public static void main() {

        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        ArrayList result = new ArrayList<>(FindingMaximumSumOfContiguousSubsequence(numbers));

        System.out.println(Arrays.deepToString(result.toArray()));
    } 

    static ArrayList FindingMaximumSumOfContiguousSubsequence(int[]  numbers) {

        ArrayList resultWithIndexes = new ArrayList<>();

        for (int index = 0; index < numbers.length - 1; index++) {

//            Array (number that was calculated, index of the first number in the actual row, amount of numbers used for calculation un row)
//            Saving single number bevor starting calculation because it can be the maximum sum of a contiguous subsequence in an array
            int[] numWithoutAnotherIndexes = new int[] {numbers[index], index, 0};
            resultWithIndexes.add(numWithoutAnotherIndexes);

            int sumOfDigitsInSequence = numbers[index];

            for (int numberOfIndexesAdded = index + 1; numberOfIndexesAdded < numbers.length; numberOfIndexesAdded++) {

                sumOfDigitsInSequence += numbers[numberOfIndexesAdded];

                int[] nums2 = new int[] {sumOfDigitsInSequence, index, numberOfIndexesAdded};

                resultWithIndexes.add(nums2);
            }
        }

        return resultWithIndexes;
    }
}
