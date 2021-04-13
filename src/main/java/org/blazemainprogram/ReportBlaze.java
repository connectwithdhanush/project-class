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
import org.openqa.selenium.WebElement;
import org.pomblaze.ChooseFlight;
import org.pomblaze.Details;
import org.pomblaze.FindFlightpage;
import org.pomblaze.IdValue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportBlaze extends BaseClass {

	ExtentReports reports;
	ExtentHtmlReporter html;
	ExtentTest test;

	BaseClass b = new BaseClass();

	@BeforeClass
	private void urlLaunch() {

		reports = new ExtentReports();
		html = new ExtentHtmlReporter("C:\\Users\\dell\\eclipse-workspace\\SanthoshTask\\Report\\extentreport.html");
		reports.attachReporter(html);

		b.getDriver();
		b.loadUrl("https://blazedemo.com/");
		b.maximize();

	}

	@AfterClass
	private void end() {
		reports.flush();
	}

	@Test(priority = 1)
	@Parameters({ "dep", "des" })
	private void findFlight(String s1, String s2) {

		test = reports.createTest("LoginBlazeDemo");
		test.log(Status.INFO, "Login into Blaze Application");
		test.log(Status.INFO, "Verify Blaze url");
		if (driver.getCurrentUrl().contains("blazedemo")) {

			test.log(Status.PASS, "Valid url");

		} else {

			test.log(Status.FAIL, "Invalid url");

		}

		FindFlightpage f = new FindFlightpage();
		b.sendKeys(f.getDep(), s1);
		b.sendKeys(f.getDes(), s2);
		b.click(f.getBtn());

	}

	@Test(priority = 2)
	private void chooseTheFlight() {
		ChooseFlight f1 = new ChooseFlight();

		test = reports.createTest("Choosing the Flight");
		test.log(Status.INFO, "choose flight");

		WebElement btnchoose = f1.getBtnchoose();

		if (btnchoose.isEnabled() && btnchoose.isDisplayed()) {
			test.log(Status.PASS, "Choose flight button is enabled");
			b.click(f1.getBtnchoose());

		}

	}

	@Test(priority = 3)
	@Parameters({ "name", "address", "city", "state", "zip", "type", "cno", "month", "year", "cname" })
	private void details(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8,
			String s9, String s10) {

		Details f2 = new Details();

		test = reports.createTest("Entering passenger Details");
		test.log(Status.INFO, "passenger Details");

		WebElement name = f2.getName();
		if (name.isEnabled() && name.isDisplayed()) {
			test.log(Status.PASS, "Name Textbox is Enabled");
			b.sendKeys(f2.getName(), s1);

		}

		WebElement address = f2.getAddress();
		if (address.isEnabled() && address.isDisplayed()) {
			test.log(Status.PASS, "Address Textbox is Enabled");
			b.sendKeys(f2.getAddress(), s2);

		}

		WebElement city = f2.getCity();
		if (city.isEnabled() && city.isDisplayed()) {
			test.log(Status.PASS, "city Textbox is Enabled");
			b.sendKeys(f2.getCity(), s3);
		}

		WebElement state = f2.getState();
		if (state.isEnabled() && state.isDisplayed()) {
			test.log(Status.PASS, "state Textbox is Enabled");
			b.sendKeys(f2.getState(), s4);

		}

		WebElement zipcode = f2.getZipCode();
		if (zipcode.isEnabled() && zipcode.isDisplayed()) {
			test.log(Status.PASS, "zipcode Textbox is Enabled");
			b.sendKeys(f2.getZipCode(), s5);

		}

		WebElement cardtype = f2.getCardType();
		if (cardtype.isEnabled() && cardtype.isDisplayed()) {
			test.log(Status.PASS, "cardtype Textbox is Enabled");
			b.selectByText(f2.getCardType(), s6);

		}

		WebElement cardnumber = f2.getCreditCardNumber();
		if (cardnumber.isEnabled() && cardnumber.isDisplayed()) {
			test.log(Status.PASS, "cardnumber Textbox is Enabled");
			b.sendKeys(f2.getCreditCardNumber(), s7);

		}

		WebElement creditcardmonth = f2.getCreditCardMonth();
		if (creditcardmonth.isEnabled() && creditcardmonth.isDisplayed()) {
			test.log(Status.PASS, "creditcardmonth Textbox is Enabled");
			b.sendKeys(f2.getCreditCardMonth(), s8);

		}

		WebElement creditcardyear = f2.getCreditCardYear();
		if (creditcardyear.isEnabled() && creditcardyear.isDisplayed()) {
			test.log(Status.PASS, "creditcardyear Textbox is Enabled");
			b.sendKeys(f2.getCreditCardYear(), s9);

		}

		WebElement cardname = f2.getNameOnCard();
		if (cardname.isEnabled() && cardname.isDisplayed()) {
			test.log(Status.PASS, "cardname Textbox is Enabled");
			b.sendKeys(f2.getNameOnCard(), s10);

		}

		WebElement btnrememberme = f2.getRememberMe();
		if (btnrememberme.isEnabled() && btnrememberme.isDisplayed()) {
			test.log(Status.PASS, "btnrememberme checkbox is Enabled");
			b.click(f2.getRememberMe());

		}

		WebElement btnsubmit = f2.getBtnsubmit();
		if (btnsubmit.isEnabled() && btnsubmit.isDisplayed()) {
			test.log(Status.PASS, "btnsubmit Textbox is Enabled");
			b.click(f2.getBtnsubmit());

		}

	}

	@Test(priority = 4)
	private void id() throws IOException {

		test = reports.createTest("confirmation page");
		test.log(Status.INFO, "order Details");

		IdValue f3 = new IdValue();

		WebElement id = f3.getId();
		if (id.isDisplayed()) {
			test.log(Status.INFO, "order Details gets displayed");

			String text = b.getText(f3.getId());
			System.out.println(text);
			File f = new File("Excel.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet s = w.createSheet("Data1");
			Row r = s.createRow(0);
			Cell c = r.createCell(0);
			c.setCellValue(text);

			FileOutputStream o = new FileOutputStream(f);
			w.write(o);
			System.out.println("done");
		}

	}

}
