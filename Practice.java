import java.util.*;

class Practice 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int num1 = 0, num2 = 1;
		if(num<0){
			System.out.println("Invalid");
			return;
		}
		for(int i = 0;i<num;i++){
			System.out.printf("%d,",num1);
			
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
	}
}
