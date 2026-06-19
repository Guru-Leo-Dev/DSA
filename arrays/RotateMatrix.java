
class RotateMatrixSolution {
      // Function to rotate the matrix 90 degrees clockwise using extra space
    public int[][] rotateClockwise(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][(n-i)-1] = matrix [i][j];
            }
        }
        return result;
    }
}


public class RotateMatrix {
    public static void main(String[] arg) {
         int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        RotateMatrixSolution obj = new RotateMatrixSolution();
        int[][] rotated = obj.rotateClockwise(mat);

        // Print the rotated matrix
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
