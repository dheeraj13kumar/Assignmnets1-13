package pkg1;
import java.util.Scanner;
public class Assignment7c 
{
	public static void main(String[] args) 
	{
		int n; 
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number to check");
		n=s.nextInt();
		int half=n/2;
		int temp=0;
		for(int i=2;i<=half;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime number");
				temp=1;
				break;
				}
		}
		{
			if(temp==0)
			{System.out.println("It is a prime number");
		    }
		}
		}
}