
package company.saifPro.Helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;


/**
 * @author Bhanu Pratap
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 */
public class AlertHelper2{
	
private WebDriver dr;
private Logger log = LoggerHelper2.getLogger(AlertHelper2.class);

public AlertHelper2(WebDriver dr)
{
	this.dr=dr;
	log.debug("aLERT INTIALIZE");
	
}

public Alert switchToAlert()
{

	log.debug("Switching Alert");
return dr.switchTo().alert();	
}

public String getAlertText()
{
String s = switchToAlert().getText();
return s;
}

public void acceptAlert()
{
	
	switchToAlert().accept();
}

public void dismissAlert()
{
	
	switchToAlert().dismiss();
}


public void acceptPromptAfterEnteringText(String text)
{
Alert al=switchToAlert();
al.sendKeys(text);
al.accept();

}


public boolean isAlertPresent()
{
try {
	dr.switchTo().alert();
	return true;
} catch (NoAlertPresentException e) {
	// TODO Auto-generated catch block
return false;
}}


public void acceptifPresent()
{
	if(isAlertPresent())
	{
		
		acceptAlert();
	}
}


public void dismissifPresent()
{
	if(!isAlertPresent())
	{
		
		dismissAlert();
	}
}


}
