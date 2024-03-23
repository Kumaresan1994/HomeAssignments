package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
public static String [][] exevalue (String filadata) throws IOException {
	

	XSSFWorkbook wb=new XSSFWorkbook("./Testdata/"+filadata+".xlsx");

	//step-2
	//index value
	XSSFSheet sheet=wb.getSheetAt(0);

	//using sheet name
	//XSSFSheet sheet2 = wb.getSheet("sheet1");

	//step-3
	int rowCount = sheet.getLastRowNum();
	System.out.println(" total number of rows :"+rowCount);

	//exclude the header value
	int phy = sheet.getPhysicalNumberOfRows();
//	System.out.println("include the header value :"+phy);

	//step4
	short cellCount = sheet.getRow(1).getLastCellNum();
//	System.out.println("total number of cells :"+cellCount);
	
	String [][]data1 = new String [rowCount][cellCount]; 

	//step5
	//String getdata = sheet.getRow(1).getCell(3).getStringCellValue();
//	System.out.println(getdata);

	for (int i = 1; i <=rowCount; i++) {
	for (int j = 0; j < cellCount; j++) {

	String data = sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println(data);
	data1[i-1][j]=data;
	} 
	}
	//step -6
	wb.close();
	return data1;

}
}