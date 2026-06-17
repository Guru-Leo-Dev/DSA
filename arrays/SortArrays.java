import java.util.*;
class SortArraysSolution {
    // Function to sort an array containing only 0s, 1s, and 2s
    public void sortZeroOneTwo(int[] nums) {
        // Count of 0s, 1s, and 2s
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // First pass: Count the number of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) cnt0++;
            else if (num == 1) cnt1++;
            else cnt2++;
        }

        // Second pass: Fill the array with 0s, then 1s, then 2s

        // Fill the first 'cnt0' elements with 0
        for (int i = 0; i < cnt0; i++) {
            nums[i] = 0;
        }

        // Fill the next 'cnt1' elements with 1
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            nums[i] = 1;
        }

        // Fill the remaining elements with 2
        for (int i = cnt0 + cnt1; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}

// Main class to run the program
public class SortArrays {
    public static void main(String[] args) {
     int[] nums = {0, 2, 1, 2, 0, 1};

        SortArraysSolution sol = new SortArraysSolution();
        sol.sortZeroOneTwo(nums);

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
