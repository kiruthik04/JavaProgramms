import java.util.*;

class PrimeOrComposite 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int prime = 1;
		for(int i = 2;i<=num/2;i++){
			if(num % i == 0){
				prime = 0;
				break;
			}
		}
		if(prime == 1 && num > 1){
			System.out.println(num+" is Prime Number");
		}else{
			System.out.println(num+" is Composite Number");
		}
	}
}
