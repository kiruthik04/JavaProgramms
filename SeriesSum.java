import java.util.*;

class SeriesSum 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int series_num = input.nextInt();
		for(int i = 0;i<series_num;i++){
			for(int j = 0;j<=i;j++){
				System.out.print(num);
			}
			System.out.print(" + ");
		}
	}
}
