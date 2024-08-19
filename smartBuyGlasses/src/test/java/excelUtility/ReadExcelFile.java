package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public ArrayList<String> ReadExcelData(int colNo) throws IOException  {
		String filePath="//Users//harishp//Documents//excel//SmartBuyGlasses.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		Iterator row=sheet.rowIterator();
		ArrayList<String> a=new ArrayList();
		while (row.hasNext()) {
			Row r=(Row) row.next();
			Cell c=r.getCell(colNo);
			if (c != null && c.getCellType() == CellType.STRING){
				String data =c.getStringCellValue();
				a.add(data);
				} 
		wb.close();
		fis.close();
	}
		return a;

	}
}
