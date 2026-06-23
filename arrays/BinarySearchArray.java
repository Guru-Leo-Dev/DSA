import java.util.*;

class BinarySearchArraySolution {
    boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

public class BinarySearchArray {
    public static void main(String[] arg) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
        int target = 9;
        BinarySearchArraySolution sol = new BinarySearchArraySolution();
        System.out.println("Found at index: " + sol.binarySearch(arr, target));
    }
}
