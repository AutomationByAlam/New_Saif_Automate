package company.saifPro.POM;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import company.saifPro.Helper.GenericHelper;
import company.saifPro.Helper.LoggerHelper;
import company.saifPro.Helper.WaitHelper;
import company.saifPro.TestBases.Config;
import company.saifPro.TestBases.TestBaby;

public class RecoverPage {
	

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(FaceLogin.class);
	
	WaitHelper waitHelp;
	PassReset pr;
	
	@FindBy(xpath=".//div[@class='signup_box clearfix']//a[contains(text(),'Sign Up')]")
	WebElement recover;
	
	public RecoverPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		WaitHelper wh = new WaitHelper(driver);
		wh.waitForElement(driver, recover, new Config(TestBaby.OR).getExplicitWait());
	}

	
	public String recovertextverify()
	{
		String text= GenericHelper.getElementText(recover);
		
		
		return text;
	}
	
	public  PassReset clickOnRecover()
	{
		
		recover.click();
		pr=new PassReset(driver);
		return pr;
	}
	
	
}
