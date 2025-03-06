import java.util.*;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] matrix_A = new int[rows][cols];
        int[][] matrix_B = new int[rows][cols];
        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                matrix_A[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                matrix_B[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                result[i][j] = matrix_A[i][j] + matrix_B[i][j];
            }
        }
        System.out.print("[");
        for(int i = 0; i < rows;i++){
            System.out.print("[");
            for(int j = 0; j < cols;j++){
                if(j != cols - 1) System.out.print(result[i][j] + ",");
                else System.out.print(result[i][j]);
            }
            if(i != rows -1) System.out.print("],");
            else System.out.print("]");
        }
        System.out.print("]");
        in.close();
    }
}