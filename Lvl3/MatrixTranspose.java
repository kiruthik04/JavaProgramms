import java.util.*;

class MatrixTranspose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                matrixA[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                transpose[j][i] = matrixA[i][j];
            }
        }
        System.out.print("[");
        for(int i = 0; i < cols;i++){
            System.out.print("[");
            for(int j = 0; j < rows;j++){
                if(j != rows - 1) System.out.print(transpose[i][j] + ",");
                else System.out.print(transpose[i][j]);
            }
            if(i != cols -1) System.out.print("],");
            else System.out.print("]");
        }
        System.out.print("]");

        in.close();
    }
}
