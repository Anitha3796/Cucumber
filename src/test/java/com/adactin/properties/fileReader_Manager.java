package com.adactin.properties;

import java.io.IOException;

public class fileReader_Manager {

private fileReader_Manager() {
		
	}
	
	public static fileReader_Manager getInstanceCh() {
		fileReader_Manager  frm = new fileReader_Manager();
return frm;
	}
	
	

public  configuration_Reader getInstanceCR () throws IOException  {

configuration_Reader cr = new configuration_Reader();
return cr;
	}
}