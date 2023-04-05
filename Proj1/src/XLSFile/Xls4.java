package XLSFile;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class Xls4 
{
	public void WriteDataXLS() throws IOException, RowsExceededException, WriteException
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row and Column");
	int rowcount=s.nextInt();
	int columncount=s.nextInt();
	
		File f=new File("../Proj1/xls file write.xls");
		 WritableWorkbook wk=Workbook.createWorkbook(f);
		 WritableSheet ws=wk.createSheet("Sheet0", 0);
		
	    for(int i=0;i<rowcount;i++)     // loop for rows	  	
		{
	    	for(int j=0;j<columncount;j++) // loop for columns
	    	{
	    		Label L=new Label(j,i,"Hello");
	    		ws.addCell(L);	
		    }
	    }
	    wk.write();  // for saving the file
	    wk.close(); // for closing the file
	}
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException  
	{
		Xls4 Write=new Xls4();
		Write.WriteDataXLS();
	}
}
	