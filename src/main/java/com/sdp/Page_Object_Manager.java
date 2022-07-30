package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Hotel;
import com.pom.Login_Hotel;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	public static WebDriver driver;
	private Login_Hotel a;
	private Search_Hotel b;
	private Select_Hotel c;
	private Book_Hotel d;
	
	public  Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Login_Hotel getA() {
		a=new Login_Hotel(driver);
		return a;
	}
	public Search_Hotel getB() {
		b=new Search_Hotel(driver);
		return b;
	}
	public Select_Hotel getC() {
		c=new Select_Hotel(driver);
		return c;
	}
	public Book_Hotel getD() {
		d=new Book_Hotel(driver);
		return d;
	}
	

	}

	


