package Excel;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class TestExcel2 {
	public static void main(String[] args) throws Exception{
		InputStream is=new FileInputStream("d:/二货名单.xls");
		POIFSFileSystem fs=new POIFSFileSystem(is);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet hssfSheet=wb.getSheetAt(0); // 获取第一个Sheet页
		if(hssfSheet==null){
			return;
		}
		// 遍历行Row
		for(int rowNum=1;rowNum<=9;rowNum++){
			HSSFRow hssfRow=hssfSheet.getRow(rowNum);
			if(hssfRow==null){
				continue;
			}
			// 遍历列Cell
			System.out.print(hssfRow.getCell(0).getStringCellValue()+"   ");
			System.out.print(hssfRow.getCell(1).getStringCellValue()+"   ");
			System.out.print(hssfRow.getCell(2).getStringCellValue()+"   ");
			System.out.print(hssfRow.getCell(3).getStringCellValue()+"   ");
			System.out.print(hssfRow.getCell(4).getStringCellValue()+"   ");
			System.out.print(hssfRow.getCell(5).getStringCellValue()+"   ");System.out.println(""); 
		}
			}
			
	}

