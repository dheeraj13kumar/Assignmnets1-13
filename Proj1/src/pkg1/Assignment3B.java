package pkg1;

public class Assignment3B
{
	public void method() 
	{
		this.method3();
     System.out.println("Default method");
    }
	public void method1()  
	{
		this.method();
     System.out.println("one parameterized method");
    }
	public void method2() 
	{
		this.method4();
     System.out.println("two parameterized method");
    }
	public void method3()  
	{
     System.out.println("three parameterized method");
    }
	public void method4() 
	{
		this.method1();
	 System.out.println("four parameterized method");
	}
	public static void main(String[] args) 
	{
		Assignment3B obj=new Assignment3B();
		obj.method2();
	}
	}
