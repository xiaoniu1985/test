package Excel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;




public class TestExcel {
     public static void main(String[] args) throws Exception {
    	 HSSFWorkbook wb = new HSSFWorkbook();
 		HSSFSheet sheet = wb.createSheet();
 		sheet.setDefaultColumnWidth(30); 
		ArrayList<String> list = new ArrayList<String>();
		 list.add("学号");list.add("姓名");list.add("原班级");list.add("现班级");list.add("原专业");list.add("现专业");
		createHeader(sheet,list,getStyleByName(wb,"style1"));
		createBody(sheet,getStyleByName(wb,"style"));
		File f=new File("d:/测试的.xls");
		wb.write(new FileOutputStream(f));
	}

     private static HSSFCellStyle getStyleByName(HSSFWorkbook wb,String name)
     {  
    	HSSFCellStyle style1 = wb.createCellStyle();
 		style1.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 设置水平对齐
 		HSSFFont font = wb.createFont();
 		font.setFontName("微软雅黑");// 设置字体名
 		font.setFontHeightInPoints((short) 12);
 		style1.setFont(font);
 		
 		
 		HSSFCellStyle style= wb.createCellStyle();  
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置水平对齐
		HSSFDataFormat format = wb.createDataFormat();  
		style.setDataFormat(format.getFormat("@"));  
		
		if(name.equals("style"))
			return style;
		if(name.equals("style1"))
			return style1;
		else
    	 return null;
     }
    
	private static void createBody(HSSFSheet sheet, HSSFCellStyle style) {
		for(int i=0;i<2000;i++ )
		{
			Row row=sheet.createRow(i+1);
			for(int  j=0;j<6;j++){
			    Cell cell=row.createCell(j);
			     cell.setCellStyle(style);
			    }
		
	}}
	
	

	private static void createHeader(HSSFSheet sheet,ArrayList <String> list,HSSFCellStyle style) {
	   Row row=sheet.createRow(0);
	    for(int i=0;i<6;i++){
	    Cell cell=row.createCell(i);
	    cell.setCellValue(list.get(i));
	    cell.setCellStyle(style);
	    }
		
	}
}
