package pkg2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TextFile4 
{
	public void WriteInARange() throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter initial row & end row");
		int initial=s.nextInt();
		int end=s.nextInt();
		System.out.println("Enter data to be printed");
		String a=s.next();
		File f=new File("F:\\DJ BACKUP\\Java\\ECLIPSE2\\Proj1\\write data.txt");  // establish connection
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=1;i<=end;i++) 
		{
		   if((i>=initial)&&(i<=end))    
		    {
		      bw.write(a);  // write user data
		    }
		   bw.newLine(); 
		 }
		   bw.close();
	}
	public static void main(String[] args) throws IOException
	{
		TextFile4 wr=new TextFile4();
		wr.WriteInARange();
	}
}
