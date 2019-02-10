import java.util.Scanner;

public class SumOfDigit {
	public static void main(String args[])
	{
		int number;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter number");
		number=scan.nextInt();
		
		int result=0;
		while(number>0)
		{
			result=result+number%10;
			number=number/10;
		}
		
		System.out.println(result);
	}

}
