class Factorial{
    public static void main(String[] args){
        System.out.println(fact1(5));
        System.out.println(fact2(5));
    }
    static void fact1(int n){
        if (n == 0){
            return 1;
        }
        return n * fact1(n - 1);
    }
    static void fact2(int n){
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for(int i = 1;i<=n;i++){
            dp[i] = i * dp[i-1];
        }
        return dp[n];
    }
    int fib(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ;i <= n;i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
    int trip(int n){
        int dp[] = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3 ;i <= n;i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

}