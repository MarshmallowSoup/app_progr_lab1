import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int row = 0; row < matrix.length; row++){
            System.out.println(Arrays.toString(matrix[row]));
        }
        int[][] transposed = new int[matrix[0].length][];
        for (int row = 0; row < matrix[0].length; row++)
            transposed[row] = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[row].length; col++)
                transposed[col][row] = matrix[row][col];
        for (int row = 0; row < transposed.length; row++)
            System.out.println(Arrays.toString(transposed[row]));
    }
}
