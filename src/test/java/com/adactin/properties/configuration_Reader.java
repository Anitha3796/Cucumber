package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration_Reader {
public static Properties p;
	public  configuration_Reader() throws IOException {
		File f= new File("C:\\Users\\Bala\\eclipse-workspace\\Cucumber_Adactin\\src\\test\\java\\com\\adactin\\properties\\adactin.properties");
FileInputStream fis= new FileInputStream(f);
p=new Properties();
p.load(fis);
	}
	
	public String get_Browser() {
		String browser = p.getProperty("browser");
return browser;
	}
	public String get_Url() {
		String url = p.getProperty("url");
return url;
}
}
