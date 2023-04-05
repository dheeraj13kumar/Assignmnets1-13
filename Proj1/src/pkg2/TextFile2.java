package pkg2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFile2
{
	public void ReadData() throws IOException
	{
		File f=new File("../Proj1/Textfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int line=0;
		String s;
		while((s=b.readLine())!=null)
		{
			line=line+1;
			int particularLine=2;
			if(line==particularLine)
			 {
				 System.out.println(s); 
			 }
			
		}
	}
	public static void main(String[] args) throws IOException 
	{
		TextFile2 r=new TextFile2();
		r.ReadData();
	}
}
