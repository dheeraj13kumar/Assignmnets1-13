package XLSFile;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Xls1 
{
	public void ReadCellData(int row, int column) throws BiffException, IOException 
	{
		File f=new File("../Proj1/XLS file read.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();   //will give the no of rows
		int c=ws.getColumns();  //will give the no of columns
		for(int i=row;i<=row;i++)     // loop for rows
		{
			for(int j=column;j<=column;j++) // loop for columns
			{
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException
	{
		Xls1 ReadCell=new Xls1();
		ReadCell.ReadCellData(3, 1);
	}
	
}

