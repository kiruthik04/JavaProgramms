class Subarray{
    static void subarray(){

    }
    static void subarraySum(int[] arr){
        int n = arr.length;
        int res = 0;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i ;j<n;j++){
                sum += arr[j];
            }
            res = Math.max(res, sum);
        }
        System.out.println(res);
    }
    static void kadane(int[] arr){
        int n = arr.length;
        int res = arr[0], maxend = arr[0];
        for(int i = 1; i < n; i++){
            maxend = Math.max(maxend + arr[i], arr[i]);
            res = Math.max(res, maxend);
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        subarraySum(arr);
        kadane(arr);
        
    }
}