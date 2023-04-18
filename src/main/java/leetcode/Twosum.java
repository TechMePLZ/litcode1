package leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Решение через хэшмап где ключ  значение в массиве, а индекс как значение
 */
public class Twosum {
    public static void main(String[] args) {

        int[] nums = {3,2,5,7};
        int target = 9;
        int[] sol = solution(nums, target);

        System.out.println(Arrays.toString(sol));
    }
    @NotNull
    public static int[] solution(int[] nums, int target){
       // задачем длинну массива
        int n = nums.length;
        // Создаем хэш мапу куда сложим наш массив, где значение это ключ, а индекс как значение
        Map<Integer, Integer> map = new HashMap<>();
        // создаем массив для решения длиной 2
        int[] result = new int[2];
        // проходим в цикле по массиву, и если ключ в мапе равен разнице таргета и значению то кладем в резалт
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
