package arrays;
import java.util.*;

// Class containing Pascal's Triangle generation logic
class PascalsTriangleSolution {
    // Function to generate Pascal's Triangle up to numRows
    public List<List<Integer>> generate(int numRows) {
        // Result list to hold all rows
        List<List<Integer>> triangle = new ArrayList<>();
        // Loop for each row
        for (int i = 0; i < numRows; i++) {
         List<Integer> row = getEntireRow(i+1);
          triangle.add(row);
        }
        return triangle;
    }

    // Function to generate Pascal's Triangle up to numRows
    public List<List<Integer>> generate_1(int numRows) {
         // Result list to hold all rows
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop for each row
        for (int i = 0; i < numRows; i++) {
            // Create a row with size (i+1)
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            // Fill elements from index 1 to i-1 (middle values)
            for (int j = 1; j < i; j++) {
                // Each element = sum of two elements above it
                row.set(j, triangle.get(i - 1).get(j - 1) +
                           triangle.get(i - 1).get(j));
            }

            // Add current row to the triangle
            triangle.add(row);
        }
        return triangle;
    }

    // Function to generate Pascal's Triangle up to numRows
    public List<List<Integer>> generat_2(int numRows) {
        // Result list to hold all rows
        List<List<Integer>> triangle = new ArrayList<>();
        // Loop for each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                List<Integer> temp = triangle.get(i-1);
                row.add(temp.get(j-1) + temp.get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

     private List<Integer> getEntireRow(int n) {
        int ans = 1;
        List<Integer> rows = new ArrayList<>();
        rows.add(ans);
        System.out.println();
        for(int i = 1; i < n; i++) {
            ans = ans*(n-i);
            ans = ans/i;
            rows.add(ans);
        }
        return rows;
    }

    public void printEntireRow(int n) {
        int ans = 1;
        List<Integer> rows = new ArrayList<>();
        System.out.println("-------- Entire Row --------------");
        rows.add(ans);
        System.out.println();
        for(int i = 1; i < n; i++) {
            ans = ans*(n-i);
            ans = ans/i;
            rows.add(ans);
        }
        for (Integer val : rows) System.out.print(val + " ");
        System.out.println();
        System.out.println("----------------------------------");
    }

    public void printSpecificElement(int n, int r) {
        n = n-1;
        r = r-1;
        int result = 1;
        for(int i = 0; i < r; i++ ) {
            result = result * (n-i);
            result = result / (i+1);
        }
        System.out.println("----------------------------------");
        System.out.println("-------- Specific Element --------");
        System.out.println("result : " + result);
        System.out.println("----------------------------------");
    }

}

public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangleSolution obj = new PascalsTriangleSolution();
        int n = 6;

        // Generate and print Pascal's Triangle
        List<List<Integer>> result = obj.generate_1(n);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }

        int rowNum = 6;
        obj.printEntireRow(rowNum);

        obj.printSpecificElement(6,5);
    }
}
