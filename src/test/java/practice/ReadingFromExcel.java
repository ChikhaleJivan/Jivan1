package practice;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadingFromExcel 
{
	@Test
	public void ReadingFromMain() throws Throwable
	{
		File f=new File(".\\datafiles\\student.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rownum=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		for(int r=0;r<=rownum;r++)
		{
			XSSFRow row=sheet.getRow(r); //0
			for(int c=0;c<col;c++)
			{
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
