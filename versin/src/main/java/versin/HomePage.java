package versin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
// 1) First declare the webelements that we want to perform on this page variable.
	@FindBy(id = "username")
	public WebElement userName1;
	@FindBy(id = "password")
	public WebElement passWord;
	@FindBy(id = "login")
	public WebElement login;
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	public WebElement error;
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// 2) mention whatever actions we're going to perform on those webelement as
	// methods

	public boolean login() {
		userName1.sendKeys("akash");
		passWord.sendKeys("Akash");
		login.click();
		boolean a = error.isDisplayed();
		return a;

	}

}
