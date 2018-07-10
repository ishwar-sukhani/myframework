package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFWorkbook excelWorkbook;
	private static XSSFSheet excelSheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	public static void setExcelFile(String path, String sheetName){
		try{
			FileInputStream excelFile = new FileInputStream(path);
			excelWorkbook = new XSSFWorkbook(excelFile);
			excelSheet = excelWorkbook.getSheet(sheetName);
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static String getCellData(int rowNum, int colNum){
		try{
			cell = excelSheet.getRow(rowNum).getCell(colNum);
			String cellData = cell.getStringCellValue();
			return cellData;
		}
		catch(Exception e){
			return "";
		}
	}
	
	public static void setCellData(String Result, int rowNum, int colNum){
		try{
			row = excelSheet.getRow(rowNum);
			cell = row.getCell(colNum, row.RETURN_BLANK_AS_NULL);
			if(cell == null){
				cell = row.createCell(colNum);
				cell.setCellValue(Result);
			}
			else{
				cell.setCellValue(Result);
			}
			
			FileOutputStream fileOut = new FileOutputStream(Constant.TestDataDir + Constant.TestDataFile);
			excelWorkbook.write(fileOut);
		}
		catch(Exception e){
			System.out.println();
		}
	}

}
