package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	File file;
	
	public ConfigDataProvider(){
		
		//File file = new File(".TestData/config.properties");
		file = new File("F:/SeleniumFramework/com.testselenium.framework/TestData/config.properties");
		 
		try {
			FileInputStream fis = new FileInputStream(file);
			pro= new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is : "+ e.getMessage());
		}
	}
	
	public String getApplicationUrl(){
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getChromePath(){
		String chromePath=pro.getProperty("chromePath");
		return chromePath;
	}
	
	
}
