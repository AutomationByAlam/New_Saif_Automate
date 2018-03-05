package company.saifPro.TestPurpose;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import company.saifPro.TestBases.Config;

public class Debuging {

	private static int a=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int j=0;
		
		for(int i=0;i<=10;i++)
		{
			Debuging d =new Debuging();
			j=j+2+a;
			a=a+1;
			int k=0;
			
			int f=0;
			
			int l=0;
			//String s=c.getBrowser(); 
			
			
		Properties	OR = new Properties();
		File	f1 = new File(System.getProperty("user.dir")+"/src/main/java/company/saifPro/config/config.properties");
			FileInputStream file = new FileInputStream(f1);
			OR.load(file);
			//logger.info("loading config.properties");
			
			f1 = new File(System.getProperty("user.dir")+"/src/main/java/company/saifPro/config/config.properties");
			file = new FileInputStream(f1);
			OR.load(file);
			//logger.info("loading or.properties");
			
		Config c=new Config(new Properties());	
		

		String s=c.getBrowser();
//		System.out.println(c.getBrowser().length());
		
		int h=0;
		
		
		}
		
	}

}
