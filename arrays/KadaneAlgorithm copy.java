import java.util.*;
class KadaneAlgorithmSolution {
     // Function to find maximum sum of subarrays
    public int maxSubArray(int[] nums) {
        
        // Maximum sum
        long max = Long.MIN_VALUE; 
        
        // Current sum of subarray 
        long sum = 0; 
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            
            // Add current element to the sum
            sum += nums[i]; 
            
            // Update maxi if current sum is greater
            if (sum > max) {
                max = sum; 
            }
            
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0; 
            }
        }
        
        // Return the maximum subarray sum found
        return (int) max;
    }
}

// Main class to run the program
public class KadaneAlgorithm {
    public static void main(String[] args) {
    //    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
       int[] arr = { -2, -3, -5 };

        // Create an instance of Solution class
        KadaneAlgorithmSolution sol = new KadaneAlgorithmSolution();

        int maxSum = sol.maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
