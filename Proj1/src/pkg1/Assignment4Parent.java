package pkg1;

public class Assignment4Parent 
{
	public Assignment4Parent() 
	{
		this(6,7,9);
     System.out.println("Parent Default constructor");
    }
	public Assignment4Parent(int a) 
	{
		this();
     System.out.println("Parent 1 parameterized constructor");
    }
	
	public Assignment4Parent(int a,int b) 
	{
		this(6);
     System.out.println("Parent 2 parameterized constructor");
    }
	public Assignment4Parent(int a,int b, int c) 
	{
		System.out.println("Parent 3 parameterized constructor");
    }
	public Assignment4Parent(int a,int b, int c, int d) 
	{
		this(3,4);
	 System.out.println("Parent 4 parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assignment4Parent obj=new Assignment4Parent();
		
	}
}
