import java.util.*;

class TwoSumIndex{
    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0;i<n;i++){
            nums[i] = in.nextInt();
        }
        
        int target = in.nextInt();

        int[] result = new int[2];
        boolean found = false;

        for(int i = 0;i<n;i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){
               result[0] = hashMap.get(complement);
               result[1] = i;
               found = true;
               break;
            }
            hashMap.put(nums[i], i);

        }

        if(found){
            System.out.println(Arrays.toString(result));
        }else{
            System.out.println("No valid pair is found.");
        }
    }
}