import java.util.*;

class MergeOverLapSubIntervalSolution {
    // Function to merge overlapping intervals using brute force
        public List<List<Integer>> merge(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // List to store merged intervals
        List<List<Integer>> ans = new ArrayList<>();

        // Traverse through all intervals
        for (int[] interval : intervals) {
            // If merged list is empty or no overlap
            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < interval[0]) {
                // Add current interval as a new block
                ans.add(Arrays.asList(interval[0], interval[1]));
            } else {
                // Overlapping: update end to max of both
                int last = ans.size() - 1;
                int maxEnd = Math.max(ans.get(last).get(1), interval[1]);
                ans.get(last).set(1, maxEnd);
            }
        }

        return ans;
    }
}

public class MergeOverLapSubInterval {
    public static void main (String[] args) {
        
        MergeOverLapSubIntervalSolution sol = new MergeOverLapSubIntervalSolution();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> result = sol.merge(intervals);
        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }

    }
}
