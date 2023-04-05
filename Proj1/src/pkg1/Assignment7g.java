package pkg1;
import java.util.Scanner;
public class Assignment7g 
{
	public static void main(String[] args) 
	{
	    int number,i, b=1;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number to get Factorial");
		number=s.nextInt();
		for(i=1;i<=number;i++)
		{
			b=b*i;
		}
			System.out.println("Factorial of number is " +b);
		}
		}
