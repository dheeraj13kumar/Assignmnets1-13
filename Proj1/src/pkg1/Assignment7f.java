package pkg1;
import java.util.Scanner;
public class Assignment7f 
{
	public static void main(String[] args) 
	{
	    int a,b,i;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number to print table");
		a=s.nextInt();
		for(i=1;i<=10;i++)
		{
			b=a*i;
			System.out.println(a +"x" +i +"=" +b);
		}
		}
}
