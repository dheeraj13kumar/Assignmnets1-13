package pkg1;

public class Assignment2A 
{
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
	
	public int multi(int e,int f)
	{
	int g;
	g=e*f;
	System.out.println("multi result is "+g);
	return g;
	}
	public void div(int i,int j)
	{
	int k;
	k=i/j;
	System.out.println("div result is "+k);
	}
	
	public static void main(String[] args) 
	{
		Assignment2A abc=new Assignment2A();
		int sum1 =abc.sum(10, 2);
	    int sum2 =abc.sum(sum1, 2);
	    int subresult=abc.sub(sum2, 2);
	    int multiresult =abc.multi(subresult, 2);
	    abc.div(multiresult, 2);
	    }
}
