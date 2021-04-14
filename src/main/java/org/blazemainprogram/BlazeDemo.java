package org.blazemainprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.pomblaze.ChooseFlight;
import org.pomblaze.Details;
import org.pomblaze.FindFlightpage;
import org.pomblaze.IdValue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlazeDemo extends BaseClass {
	
	public static void main(String[] args) {
		System.out.println("Dhana");
	}
	
	
//	BaseClass b=new BaseClass();
//	
//	@BeforeClass
//	private void urlLaunch() {
//		
//		b.getDriver();
//		b.loadUrl("https://blazedemo.com/");
//        b.maximize();
//	}
//	
//	
//	
//	@Test(priority=1)
//	@Parameters({"dep","des"})
//	private void findFlight(String s1,String s2) {
//		FindFlightpage f=new FindFlightpage();
//		b.sendKeys(f.getDep(), s1);
//		b.sendKeys(f.getDes(), s2);
//		b.click(f.getBtn());
//		
//		
//	}
//	
//	
//	@Test(priority=2)
//	private void chooseTheFlight() {
//		ChooseFlight f1=new ChooseFlight();
//		b.click(f1.getBtnchoose());
//		
//		
//}
//	
//@Test(priority=3)
//@Parameters({"name","address","city","state","zip","type","cno","month","year","cname"})
//private void details(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10) {
//	Details f2=new Details();
//	b.sendKeys(f2.getName(),s1);
//	b.sendKeys(f2.getAddress(),s2);
//	b.sendKeys(f2.getCity(),s3);
//	b.sendKeys(f2.getState(),s4);
//	b.sendKeys(f2.getZipCode(),s5);
//	b.selectByText(f2.getCardType(),s6);
//	b.sendKeys(f2.getCreditCardNumber(),s7);
//	b.sendKeys(f2.getCreditCardMonth(),s8);
//	b.sendKeys(f2.getCreditCardYear(),s9);
//	b.sendKeys(f2.getNameOnCard(),s10);
//	b.click(f2.getRememberMe());
//	b.click(f2.getBtnsubmit());
//	
//	}
//
//@Test(priority=4)
//private void id() throws IOException {
//	IdValue f3=new IdValue();
//	String text = b.getText(f3.getId());
//	System.out.println(text);
//	File f=new File("Excel.xlsx");
//	Workbook w = new XSSFWorkbook();
//	Sheet s = w.createSheet("Data1");
//	Row r = s.createRow(0);
//	Cell c = r.createCell(0);
//	c.setCellValue(text);
//	
//	FileOutputStream o = new FileOutputStream(f);
//	w.write(o);
//	System.out.println("done");
//	
//			
//	
//	
//	
//	
//}
//	
	

}
