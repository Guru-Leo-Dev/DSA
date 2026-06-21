import java.util.*;
 
class FindRepeatingMissingNumberSolution {
    static int[] findMissingRepeatingNumbers (int[] nums) {
        int n = nums.length;
        int missing = 0;
        int repeating = 0;
        int[] arr = new int[2];
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n-1; j++) {
                if(nums[j] == i) {
                    count++;
                }
                if(count == 0) {
                    missing = nums[j];
                }
                if(count > 1) {
                    repeating = nums[j];
                }
                if (missing < 0 && repeating < 0) {
                    arr[0] = repeating;
                    arr[1] = missing;
                    return arr;
                }
            }
        }
        return arr;
    }
}
 
public class FindRepeatingMissingNumber {
    public static void main (String[] args) {
         int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
 
        FindRepeatingMissingNumberSolution sol = new FindRepeatingMissingNumberSolution();
        int[] result = sol.findMissingRepeatingNumbers(nums);
        System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
    }
}
 
 