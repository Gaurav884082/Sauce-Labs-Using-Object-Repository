package obj_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {
	Properties pro;
	public ConfigFileReader() {
		try {
			File src=new File("./PropertiesFile/config.property");//in java File is a class
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is ....." + e.getMessage());
		}
	}
	public String getChromePath() {
		String path=pro.getProperty("ChromeDriver");
		return path;
	}
	public String getEdgePath() {
		String path=pro.getProperty("EdgeDriver");
		return path;
	}
	public String getFireFoxPath() {
		String path=pro.getProperty("FireFoxDriver");
		return path;
	}   
	public String getAppURL() {
		String Url=pro.getProperty("baseUrl");
		return Url;
	}
	public String UName() {
		String Uname=pro.getProperty("Uname");
		return Uname;
	}
	public String PWord() {
		String Pswd=pro.getProperty("Psd");
		return  Pswd;
	}
	public String SignButton() {
		String button=pro.getProperty("SignIn");
		return button;
	}
	public String Excelsheet () {
		String path=pro.getProperty("ExcelSheet");
		return path;
	}

}
