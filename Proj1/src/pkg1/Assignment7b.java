package pkg1;

import java.util.Scanner;

public class Assignment7b 
{
public static void main(String[] args)
{
	System.out.println("Enter the value of x and y");
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	System.out.println("Before swapping:" +x +" "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After swapping: "+x +" "+y);   
}
}