package loginproject1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class LoginDetails {	
	
	public static String uname;
	public static String passwd;
	
	public static String uname1;
	public static String passwd1;
	
	public static String registername;
	public static String registerpassword;
	public static String mobilenumber2;

	
	public static void validata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\udupa\\eclipse-Selenium\\selenium\\TestData\\AmazonData.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    uname=w1.getSheet("User_details").getRow(1).getCell(0).getStringCellValue();
	    passwd=w1.getSheet("User_details").getRow(1).getCell(1).getStringCellValue();	    
	   
	}
	
	public static void invalidata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\udupa\\eclipse-Selenium\\selenium\\TestData\\AmazonData.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    uname1=w1.getSheet("User_details").getRow(2).getCell(0).getStringCellValue();
	    passwd1=w1.getSheet("User_details").getRow(2).getCell(1).getStringCellValue();	    
	   
	}
	
	public static void registrationdata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\udupa\\eclipse-Selenium\\selenium\\TestData\\AmazonData.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    registername=w1.getSheet("User_details").getRow(3).getCell(0).getStringCellValue();
	    registerpassword=w1.getSheet("User_details").getRow(3).getCell(1).getStringCellValue();
	   double mobilenumber1=w1.getSheet("User_details").getRow(3).getCell(2).getNumericCellValue();
	   mobilenumber2=NumberToTextConverter.toText(mobilenumber1);
	    
	}

	
	

}
