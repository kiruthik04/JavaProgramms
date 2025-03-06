import java.util.*;

class ArrRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int rotate = in.nextInt();
        for(int i: arr){
            System.out.printf("%d ", arr[(i + rotate - 1)%n]);
        }
        in.close();
    }
}