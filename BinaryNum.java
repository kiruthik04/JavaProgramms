import java.util.*;
class BinaryNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Decimal - ");
        int num = input.nextInt();
        
        int[] binarynum = new int[1000];

        int i = 0;
        while(num>0){
            binarynum[i] = num % 2;
            num = num / 2;
            i++;
        }
        for(int j = i - 1;j>=0;j--){
            System.out.print(binarynum[j]);
        }
    }
}