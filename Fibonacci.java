import java.util.*;

class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int next = 0,n1=0,n2=1;
		if(num<0){
			System.out.println("Invalid Input");
		}else{
			for(int i = 0;i<=num;i++){
				System.out.print(next+" ");
				n1 = n2;
				n2 = next;
				next = n1+n2;
			}
		}
	}
}
