package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	// objects
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	public LoginPage(WebDriver basedriver) {
		
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	
	//***********Methods*************
	public void Login(String UserNameVal, String PassVal) {
		
		 //Step1. Click on the login link
   		LoginLink.click();
		
		//Step2: Enter UserName
		 
		UserName.sendKeys(UserNameVal);
		
		//Step3: Enter Password
		 
		Password.sendKeys(PassVal);
		
		//Step4: Click on Remember me checkbox
		 
		Checkbox.click();		
		
		//Step5: Click on Login Button
		 
		LoginBtn.click();
		
	}
	
	public void UIVaidation() {
		
		
		
	}

}

