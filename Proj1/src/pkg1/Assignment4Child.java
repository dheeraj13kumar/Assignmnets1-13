package pkg1;

public class Assignment4Child extends Assignment4Parent 
{
	public Assignment4Child() 
	{
		this(4,33,88);
     System.out.println("Child Default constructor");
    }
	public Assignment4Child(int a) 
	{
		this(4,33);
     System.out.println("Child 1 parameterized constructor");
    }
	public Assignment4Child(int a,int b) 
	{
		this();
     System.out.println("Child 2 parameterized constructor");
    }
	public Assignment4Child(int a,int b, int c) 
	{
		super(2,3,4,8);
     System.out.println("Child 3 parameterized constructor");
    }
	
	public Assignment4Child(int a,int b, int c, int d) 
	{
		this(4);
	 System.out.println("Child 4 parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assignment4Child obj=new Assignment4Child(1,2,3,4);
		
}
}
