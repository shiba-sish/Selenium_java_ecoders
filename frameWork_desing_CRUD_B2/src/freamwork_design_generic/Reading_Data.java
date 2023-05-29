package freamwork_design_generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_Data implements Constants{
public static String  getdata(String sheetname, int rownumber, int cellnumber) {
	String v="";
	try {
		//path, sheetname, sheetnumber, rownumber, cellnumber, stringcellvalue
		FileInputStream fis= new FileInputStream(excelfileaddress);
		Workbook wb= WorkbookFactory. create(fis);
		v= wb.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	return v;
}
}
