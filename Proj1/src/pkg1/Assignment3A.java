package pkg1;

public class Assignment3A
{
	public Assignment3A() 
	{
		this(1,2,3,4);
     System.out.println("Default constructor");
    }
	public Assignment3A(int a) 
	{
		this();
     System.out.println("one parameterized constructor");
    }
	public Assignment3A(int a,int b) 
	{
		this(1);
     System.out.println("two parameterized constructor");
    }
	public Assignment3A(int a,int b, int c) 
	{
		this(1, 4);
     System.out.println("three parameterized constructor");
    }
	public Assignment3A(int a,int b, int c, int d) 
	{
	 System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assignment3A obj=new Assignment3A(12, 13, 56);	
	}
	}
