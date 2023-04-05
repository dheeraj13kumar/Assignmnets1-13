package pkg1;

public class Assignment2B 
{
	
	public int multi(int e,int f)
	{
	int g;
	g=e*f;
	System.out.println("multi result is "+g);
	return g;
	}
	
	public int sum(int a,int b)
	{
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
	}

	public int sub(int x,int y)
	{
	int z;
	z=x-y;
	System.out.println("sub result is "+z);
	return z;
	}
	
	public void div(int i,int j)
	{
	int k;
	k=i/j;
	System.out.println("Final result is "+k);
	}
	
	public static void main(String[] args) 
	{
		Assignment2B abc=new Assignment2B();
		int multiR=abc.multi(10, 2);
		int sumR= abc.sum(multiR, 2);
		int multi2R=abc.multi(sumR, 2);
		int subR=abc.sub(multi2R, 2);
		abc.div(subR, 2);
 }
}
