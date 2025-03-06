import java.util.*;

class MostFrequent{
    public static void main(String[] args){
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = in.nextInt();
        }

        for(int i : nums){
            numsMap.put(i, numsMap.getOrDefault(i, 0)+1);
        }
        int large_count = 0;
        for(int i: numsMap.keySet()){
            if(numsMap.get(i) > large_count) large_count = numsMap.get(i);
        }
        for(int i: numsMap.keySet()){
            if(numsMap.get(i) == large_count) System.out.println(i + " (" + large_count + " times)");
        }
    }
}