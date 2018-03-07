
package company.saifPro.Helper;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author bsingh5
 *
 */
public class ResourceHelper2 {

	
	public String getBaseResourcePath()
	{
		
		String basePath = System.getProperty("user.dir");
		return basePath;
	}


public String getResourcePath(String path)
{
	String fullpath = getBaseResourcePath()+"\\"+path;
	return fullpath;
	

}

public  FileInputStream getBaseResourceInputStream(String path) throws IOException
{
	
return new FileInputStream(getResourcePath(path));
}

}
