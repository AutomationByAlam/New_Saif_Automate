package company.saifPro.POM;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import company.saifPro.Helper.LoggerHelper;
import company.saifPro.Helper.WaitHelper;
import company.saifPro.TestBases.Config;
import company.saifPro.TestBases.TestBaby;

public class FaceLogin {

	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(FaceLogin.class);
	
	WaitHelper waitHelp;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass1;
	

	@FindBy(how=How.XPATH, using=".//*[@id='loginbutton']")
	WebElement sbt;
	
	public FaceLogin(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		WaitHelper wh = new WaitHelper(driver);
		wh.waitForElement(driver, email, new Config(TestBaby.OR).getExplicitWait());
	}
	
	public void enterEmail(String az)
	{
		log.info("Entering name");
		email.sendKeys(az);
	}
	
	public void enterpass(String pass)
	{
		log.info("Entering pass");
		pass1.sendKeys(pass);
	}

	public void loginButton()
	{
		log.info("Click on Login");
		sbt.click();
		
	}
}
