import java.util.*;

class FindDuplicates{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        LinkedHashMap<Integer, Integer> numCount = new LinkedHashMap<>();

        for(int i: arr){
            numCount.put(i, numCount.getOrDefault(i, 0)+1);
        }

        for(int i: numCount.keySet()){
            if(numCount.get(i) > 1){
                System.out.println(i + " -> " + numCount.get(i) + " times");
            }
        }
    }
}