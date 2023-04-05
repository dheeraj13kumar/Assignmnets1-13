package pkg1;
import java.util.Scanner;
public class Assignment7e 
{
	public static void main(String[] args) 
	{
	    int number; 
		Scanner s=new Scanner (System.in);
		System.out.println("Enter any number to check");
		number=s.nextInt();
		int sum=0;
		int oldnumber=number;
		while (number>0)
		{
			int r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
if (oldnumber==sum)
{
	System.out.println(oldnumber+ " is a Armstrong number");
	}
else 
{
	System.out.println(oldnumber+ " is not a Armstrong number");
}
}
}
