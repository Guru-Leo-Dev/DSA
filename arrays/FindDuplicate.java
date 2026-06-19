import java.util.*;

class FindDuplicateSolution {

     // find the duplicate by sorting and checking adjacent elements
    static int findDuplicate(int[] arr) {
        // get size
        int n = arr.length;
        // sort array in-place
        Arrays.sort(arr);
        // scan adjacent pairs
        for (int i = 0; i < n - 1; i++) {
            // return when a duplicate is found
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        // fallback if no duplicate found
        return -1;
    }
    
}

public class FindDuplicate {
    public static void main (String[] args) {
    // declare and initialize array
        int[] arr = new int[]{1, 3, 4, 2, 2};
        // print result
        System.out.println("The duplicate element is " + FindDuplicateSolution.findDuplicate(arr));
    }
}
