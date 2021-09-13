package testcase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class CreateLead extends Parent {
	@Test(dataProvider = "sendData")

	
	public void runCreateLead(String Fname, String Lname, String Company, String Phno) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phno);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider
	public String[][] sendData() throws IOException {
		return Excel.excelData("Sheet1");
				
	}
	
	
}
