package pkg2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TextFile5 

{
	public void copypaste() throws IOException 
	{
		File f1=new File("F:\\DJ BACKUP\\Java\\ECLIPSE2\\Proj1\\Textfile.txt");
		File f2=new File("F:\\DJ BACKUP\\Java\\ECLIPSE2\\Proj1\\write data.txt");
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String sourceData=null;
		while((sourceData=br.readLine())!=null)
		{
			bw.write(sourceData);
			bw.newLine();
		}
		br.close();
		bw.close();
		    
	}
	public static void main(String[] args) throws IOException 
	{
		TextFile5 obj=new TextFile5();
		obj.copypaste();
		System.out.println("data copied");
		}
	}




