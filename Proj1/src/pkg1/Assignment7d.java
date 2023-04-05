package pkg1;
import java.util.Scanner;
public class Assignment7d 
{
	public static void main(String[] args) 
	{
	    int number; 
		Scanner s=new Scanner (System.in);
		System.out.println("Enter any number to check");
		number=s.nextInt();
		int rev=0;
		int temp=number;
		while (number>0)
		{
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
if (temp==rev)
{
	System.out.println(temp+ " is a palindrome number");
	}
else 
{
	System.out.println(temp+ " is not a palindrome number");
}
}
}