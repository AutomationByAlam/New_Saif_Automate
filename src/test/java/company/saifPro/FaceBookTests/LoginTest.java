package company.saifPro.FaceBookTests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;



import company.saifPro.Helper.LoggerHelper;
import company.saifPro.POM.FaceLogin;
import company.saifPro.POM.PassReset;
import company.saifPro.POM.RecoverPage;
import company.saifPro.TestBases.Config;
import company.saifPro.TestBases.TestBaby;



public class LoginTest extends TestBaby{


	private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
	@Test
	public void testLoginToApplication(){
		log.info(LoginTest.class.getName()+" started");
		Config config = new Config(OR);
		driver.get(config.getWebsite());
		
		
		log.info("FACEbOOK lOHGIN");
		FaceLogin fb=new FaceLogin(driver);
		fb.enterEmail("az123");
		fb.enterpass("az123");
		fb.loginButton();
		
		log.info("RecoverPage");
		RecoverPage rc=new RecoverPage(driver);
		String s1=rc.recovertextverify();
	//	Assert.assertEquals(s1, "Recover Your Account");
		//rc.clickOnRecover();
		
		
	PassReset pr =	rc.clickOnRecover();
	String expected=pr.title();
	
	//Assert.assertEquals(expected, "Go to Facebook home");
}
}
