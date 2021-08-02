import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static void print(int target, int[] nums, int[] result) {
        System.out.print("The target number is " + target + "." + System.lineSeparator());
        System.out.print("The input numbers are " + Arrays.toString(nums) + "." + System.lineSeparator());
        System.out.print("The indices are " + Arrays.toString(result) + "." + System.lineSeparator());
        System.out.print(System.lineSeparator());
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > 103) {
            System.out.print("Exceed the limit." + System.lineSeparator());
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int target;
        int[] nums;
        int[] result;

        target = 9;
        nums = new int[]{2, 7, 11, 15};
        result = twoSum(nums, target);
        print(target, nums, result);

        target = 6;
        nums = new int[]{3, 2, 4};
        result = twoSum(nums, target);
        print(target, nums, result);

        target = 5;
        nums = new int[]{3, 3};
        result = twoSum(nums, target);
        print(target, nums, result);

        target = 0;
        nums = new int[]{0};
        result = twoSum(nums, target);
        print(target, nums, result);

        target = 0;
        nums = new int[104];
        result = twoSum(nums, target);
        print(target, nums, result);
    }

}