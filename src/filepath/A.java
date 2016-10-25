package filepath;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class A {
	public static void main(String[] args) throws Throwable, IOException {
		String directory=System.getProperty("user.dir");
		System.out.println(directory);
		File file=new File(directory+"/TestData/AppTestData.xlsx");
	    XSSFWorkbook b= new XSSFWorkbook(file);
	    //S
	}

}
