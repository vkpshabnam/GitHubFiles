package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	static FileInputStream f; //used to read the excel file from the system
	static XSSFWorkbook w;	//used to represent the entire excel workbook
	static XSSFSheet sh;	//used to represent the sheet in the excel workbook

	public static String readStringData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\Admin\\git\\GitHubFiles\\MVNProjects\\src\\main\\resources\\Program.xlsx"); //opens the excel file from the given location
		w = new XSSFWorkbook(f); //load the excel workbook into memory using apache poi library
		sh = w.getSheet("Sheet1"); //get the sheet from the workbook using the sheet name(Sheet1)
		XSSFRow r = sh.getRow(row);	//gets the row based on the row number passed as parameter
		XSSFCell c = r.getCell(col); //gets the cell based on the column number passed as parameter
		return c.getStringCellValue(); //returns as text

	}

	public static String readIntegerData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\Admin\\git\\GitHubFiles\\MVNProjects\\src\\main\\resources\\Program.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting
		return String.valueOf(val);   //convert int to string using valueOf() method

	}

}