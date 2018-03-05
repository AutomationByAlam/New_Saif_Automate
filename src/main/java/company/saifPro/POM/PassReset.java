package company.saifPro.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import company.saifPro.Helper.GenericHelper;
import company.saifPro.Helper.WaitHelper;
import company.saifPro.TestBases.Config;
import company.saifPro.TestBases.TestBaby;

public class PassReset {
	
	WebDriver driver;
	
	@FindBy(xpath=".//a[@title='Go to Facebook home']")
	WebElement title;
	
	public PassReset(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		WaitHelper wh = new WaitHelper(driver);
		wh.waitForElement(driver, title, new Config(TestBaby.OR).getExplicitWait());
	}
	
public String title()
{
	String ti=driver.getTitle();
	return ti;
}	
}

