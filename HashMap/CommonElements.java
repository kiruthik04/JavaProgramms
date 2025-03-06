import java.util.*;

class CommonElements{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++){
            arr1[i] = in.nextInt();
        }
        
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++){
            arr2[i] = in.nextInt();
        }
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num: arr1) set.add(num);

        for(int num : arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}