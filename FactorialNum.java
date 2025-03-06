import java.util.*;
class FactorialNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        
        int res = 1;

        for(int i = 2;i<=num;i++){
            res *= i;
        }

        System.out.print("Factorial of "+num+" is "+res);
    }
}