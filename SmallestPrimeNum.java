import java.util.*;

class SmallestPrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int prime,count = 0;
		while(count<5){
			prime = 1;
			for(int i = 2;i<=num/2;i++){
				if(num % i == 0){
					prime = 0;
					break;
				}
			}
			if(prime == 1){
				System.out.print(num+" ");
				count++;	
			}
			num++;
		}
	}
}
