package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Parameters;
import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {
	
	@Test
	public void Test1() {
		
		test.log(LogStatus.INFO, "Test1 Started");
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");
		

		//Step6: Validate the error message on screen
				WebElement Error = driver.findElement(By.id("msg_box"));
				
				String ActError = Error.getText();
				String ExpError = "The email or password you have entered is invalid.";
				//String ExpError = "The email or password you have  is invalid.";
				
				//Remove a value from expected output to verify assertion
				
				Assert.assertTrue(Error.isDisplayed());
				Assert.assertEquals(ActError, ExpError);
				
//				if(ActError.equals(ExpError)) {
//					System.out.println("TC PAssed");
//				}else {
//					System.out.println("Tc Failed");
//					}
				}

				

		
				@Test
				@Parameters({"uname","pwd"})
				public void Test2(String UserName, String Password) {
					
					test.log(LogStatus.INFO, "Test2 Started");
					LoginPage lp = new LoginPage(driver);
					//lp.Login("abc@xyz.com", "Abc@1234");
					lp.Login(UserName, Password);
				
		
	}
		@Test		
		public void Test3() {
			
			test.log(LogStatus.INFO, "Test3 Started");
			// in excel sheet the row and col starts from 0
			String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
	        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
			
	        LoginPage lp = new LoginPage(driver);
			lp.Login(UserName, Password);
		}

}
