package pkg1;

import java.util.Scanner;

public class Assignment6 
{
	public int multi(int x, int y)
	{
		int a;
		a=x*y;
		System.out.println("multi result is " +a);
		return a;
	}
	public int sum(int x, int y)
	{
		int b;
		b=x+y;
		System.out.println("sum result is " +b);
		return b;
	}
	public int sub(int x, int y)
	{
		int c;
		c=x-y;
		System.out.println("sub result is " +c);
		return c;
	}
	public void div(float x, float y)
	{
		float d;
		d=x/y;
		System.out.println("div/final result is " +d);
		}
	public static void main(String[] args)
	{
		System.out.println("Enter values of x1,x2,x3,x4,x5,x6");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		Assignment6 obj=new Assignment6();
		int multi=obj.multi(x1, x2);
		int sum=obj.sum(multi, x3);
		int sub=obj.sub(sum, x4);
		int sum1=obj.sum(sub, x5);
		obj.div(sum1, x6);
		
	}

}
