import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int[] row :
                matrix){
            for (int x :
                    row){
                System.out.print(x + "   ");
            }
            System.out.println('\n');
        }
        int[][] transposed = new int[matrix[0].length][];
        for (int row = 0; row < matrix[0].length; row++)
            transposed[row] = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[row].length; col++) {
                transposed[col][row] = matrix[row][col];
            }


        for (int[] trans:
             transposed) {
            for (int cols:
                 trans) {
                System.out.print(cols + "   ");
            }
            System.out.println('\n');
        }
