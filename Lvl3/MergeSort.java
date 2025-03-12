import java.util.*;

class MergeSort {
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new[n1];
        int[] rightArr = new[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);        
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = rightArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++
            }
            k++;
        }        
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}