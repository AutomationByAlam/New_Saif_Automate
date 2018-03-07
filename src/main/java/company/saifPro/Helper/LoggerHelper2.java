package company.saifPro.Helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * @author Bhanu Pratap
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 */
@SuppressWarnings("rawtypes")
public class LoggerHelper2 {

private static boolean root = false ;

public static Logger getLogger(Class clas)
{

	if(root)
	{
	return Logger.getLogger(clas)	;
	
	}
	
	PropertyConfigurator.configure(ResourceHelper.getResourcePath("Log4j.properties"));
	root = true;
	return Logger.getLogger(clas);
	
	
	
}
}
