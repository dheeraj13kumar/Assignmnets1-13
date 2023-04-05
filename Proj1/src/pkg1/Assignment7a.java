package pkg1;

import java.util.Scanner;

public class Assignment7a 

{
	public static void main(String[] args)
	{
		int x,y,a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x & y");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("Before swapping: " +x +" " +y);
		a=x;
		x=y;
		y=a;
		System.out.println("After swapping: " +x +" " +y);   
	}
	}
