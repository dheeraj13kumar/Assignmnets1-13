package XLSFile;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class Xls5 
{
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f=new File("../Proj1/XLS file read.xls");
		File f1=new File("../Proj1/xls file write.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		WritableWorkbook wk1=Workbook.createWorkbook(f1);
		WritableSheet ws1=wk1.createSheet("Sheet0", 0);
		 for(int i=0; i<r; i++)
		 {
			 for(int j=0; j<c; j++)
			 {
				 	Cell c1=ws.getCell(j, i);
				 	Label L=new Label(j, i, c1.getContents());
				 	ws1.addCell(L);
				 	
				 	
				 	}
		 }
		wk1.write();		
		wk1.close();					
	}	
}
