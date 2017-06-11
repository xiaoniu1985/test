package cn.itcast.domain;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IOTest {

	public static void main(String[] args) throws IOException{
		
		
		String str="中国人ss";
		OutputStreamWriter  wr=new OutputStreamWriter(new FileOutputStream("a.txt"),"gbk");
		wr.write(str);
		wr.close();
		 
		String str1="";
		byte[] bytes=str1.getBytes("gbk");
		System.out.println(new String(bytes,"utf-8"));
		
	}
}
