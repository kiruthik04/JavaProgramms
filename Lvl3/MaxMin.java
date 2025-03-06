import java.util.*;

class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i: arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.printf("%d - Max\n%d - Min", max, min);
        in.close();
    }
}