import java.util.*;
public class Today{
    static void connectnropes(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size()>1){
            int firstrope = pq.poll();
            int secondrope = pq.poll();
            res = res + firstrope + secondrope;
            pq.add(firstrope + secondrope);
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        int arr[] = {4,3,2,6};
        connectnropes(arr);
    }
}