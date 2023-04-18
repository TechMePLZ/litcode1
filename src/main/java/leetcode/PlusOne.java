package leetcode;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {0,0};
        System.out.println(Arrays.toString(solutions(digits)));
    }

    public static int[] solutions(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
        //        int[] result = new int[0];
//
//        if (digits[digits.length - 1] != 9) {
//            digits[digits.length - 1] = ++digits[digits.length - 1];
//            result = digits;
//            return result;
//        } else if (digits.length - 2 != 9) {
//            digits[digits.length - 1] = 1;
//            result = Arrays.copyOf(digits, digits.length + 1);
//            return result;
//        } else
//            digits[digits.length - 2] = 1;
//            digits[digits.length - 1] = 0;
//        result = Arrays.copyOf(digits, digits.length + 1);
//        return result;
//    }

