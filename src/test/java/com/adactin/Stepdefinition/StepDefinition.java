package com.adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Cucumber_Adactin.Base_Class;
import com.adactin.properties.fileReader_Manager;
import com.adactin.runner.Runner_Class;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {
	WebDriver driver=Runner_Class.driver;
	Page_Object_Manager pom= new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url= fileReader_Manager.getInstanceCh().getInstanceCR().get_Url();
		get(url);
	}

	@When("^user Enter The Username In Username Filed$")
	public void user_Enter_The_Username_In_Username_Filed() throws Throwable {
		sendKeys(pom.getA().getUsername(),"Anishkumar21");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		sendKeys(pom.getA().getPassword(),"Anish@2103");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		click(pom.getA().getLogin());
	}

	@Given("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		dropDown(pom.getB().getLocation(), "selectbyvalue", "Melbourne");
	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		dropDown(pom.getB().getHotels(), "selectbyvalue", "Hotel Sunshine");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropDown(pom.getB().getRoom_type(), "selectbyvalue", "Deluxe");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		dropDown(pom.getB().getRoom_nos(), "selectbyvalue", "3");
	}

	@When("^user Enter The Checkin Date$")
	public void user_Enter_The_Checkin_Date() throws Throwable {
		sendKeys(pom.getB().getDatepick_in(),"03/07/2022");
	}

	@When("^user Enter The Checkout Date$")
	public void user_Enter_The_Checkout_Date() throws Throwable {
		sendKeys(pom.getB().getDatepick_out(),"05/07/2022");
	}

	@When("^user Select The Number Of Adults$")
	public void user_Select_The_Number_Of_Adults() throws Throwable {
		dropDown(pom.getB().getAdult_room(), "selectbyvalue", "2");
	}

	@Then("^Click the Submit Button And It Navigates To Select Hotel Page$")
	public void click_the_Submit_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		click(pom.getB().getSubmit());
	}

	@Given("^Click The Checkbox$")
	public void click_The_Checkbox() throws Throwable {
		click(pom.getC().getRadio());
	}

	@Then("^Click Ok And It Navigates To Book Hotel Page$")
	public void click_Ok_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
		click(pom.getC().getOk());
	}

	@Given("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		sendKeys(pom.getD().getFirst_name(),"Anish");
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		sendKeys(pom.getD().getLast_name(),"kumar");
	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
		sendKeys(pom.getD().getAddress(),"5,greens park,US,00001");
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		sendKeys(pom.getD().getCc_num(),"2345678945612203");

	}

	@When("^user Select The Card Type$")
	public void user_Select_The_Card_Type() throws Throwable {
		dropDown(pom.getD().getCc_type(), "selectbyvalue", "AMEX");
	}

	@When("^user Select The Month$")
	public void user_Select_The_Month() throws Throwable {
		dropDown(pom.getD().getCc_exp_month(), "selectbyvalue", "3");
	}

	@When("^user Select The Year$")
	public void user_Select_The_Year() throws Throwable {
		dropDown(pom.getD().getCc_exp_year(), "selectbyvalue", "2022");
	}

	@When("^user Enter The Cvv$")
	public void user_Enter_The_Cvv() throws Throwable {
		sendKeys(pom.getD().getCc_cvv(),"000");
	}

	@Then("^Click the Submit Button$")
	public void click_the_Submit_Button() throws Throwable {
		click(pom.getD().getBook_now());
	}

	

	
//	@Given("^user Launch The Application$")
//	public void user_Launch_The_Application() throws Throwable {
//	    get("https://adactinhotelapp.com/");
//	}
//
//	@When("^user Enter The Username In Username Filed$")
//	public void user_Enter_The_Username_In_Username_Filed() throws Throwable {
//		sendKeys(pom.getA().getUsername(),"Anishkumar21");
//	}
//
//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//		sendKeys(pom.getA().getPassword(),"Anish@2103");
//	}
//
//	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
//	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
//		click(pom.getA().getLogin());
//	   }
//
//	@Given("^user Select The Location$")
//	public void user_Select_The_Location() throws Throwable {
//		dropDown(pom.getB().getLocation(), "selectbyvalue", "Melbourne");
//	}
//
//	@When("^user Select The Hotel Name$")
//	public void user_Select_The_Hotel_Name() throws Throwable {
//		dropDown(pom.getB().getHotels(), "selectbyvalue", "Hotel Sunshine");
//	}
//
//	@When("^user Select The Room Type$")
//	public void user_Select_The_Room_Type() throws Throwable {
//		dropDown(pom.getB().getRoom_type(), "selectbyvalue", "Deluxe");
//	}
//
//	@When("^user Select The Number Of Rooms$")
//	public void user_Select_The_Number_Of_Rooms() throws Throwable {
//		dropDown(pom.getB().getRoom_nos(), "selectbyvalue", "3");
//	}
//
//	@When("^user Enter The Checkin Date$")
//	public void user_Enter_The_Checkin_Date() throws Throwable {
//		sendKeys(pom.getB().getDatepick_in(),"03/07/2022");
//	}
//
//	@When("^user Enter The Checkout Date$")
//	public void user_Enter_The_Checkout_Date() throws Throwable {
//		sendKeys(pom.getB().getDatepick_out(),"05/07/2022");
//	}
//
//	@When("^user Select The Number Of Adults$")
//	public void user_Select_The_Number_Of_Adults() throws Throwable {
//		dropDown(pom.getB().getAdult_room(), "selectbyvalue", "2");
//	}
//
//
//	@Then("^Click the Submit Button And It Navigates To Select Hotel Page$")
//	public void click_the_Submit_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
//		click(pom.getB().getSubmit());
//	}
//
//	@Then("^Click The Checkbox$")
//	public void click_The_Checkbox() throws Throwable {
//		click(pom.getC().getRadio());
//	}
//
//	@Then("^Click Ok And It Navigates To Book Hotel Page$")
//	public void click_Ok_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
//		click(pom.getC().getOk());
//	}
//
//	@When("^user Enter The First Name$")
//	public void user_Enter_The_First_Name() throws Throwable {
//		sendKeys(pom.getD().getFirst_name(),"Anish");
//	}
//
//	@When("^user Enter The Last Name$")
//	public void user_Enter_The_Last_Name() throws Throwable {
//		sendKeys(pom.getD().getLast_name(),"kumar");
//	}
//
//	@When("^user Enter The Address$")
//	public void user_Enter_The_Address() throws Throwable {
//		sendKeys(pom.getD().getAddress(),"5,greens park,US,00001");
//	}
//
//	@When("^user Enter The Credit Card Number$")
//	public void user_Enter_The_Credit_Card_Number() throws Throwable {
//		sendKeys(pom.getD().getCc_num(),"2345678945612203");
//	}
//
//	@When("^user Select The Card Type$")
//	public void user_Select_The_Card_Type() throws Throwable {
//		dropDown(pom.getD().getCc_type(), "selectbyvalue", "AMEX");
//	}
//
//	@When("^user Select The Month$")
//	public void user_Select_The_Month() throws Throwable {
//		dropDown(pom.getD().getCc_exp_month(), "selectbyvalue", "3");
//	}
//
//	@When("^user Select The Year$")
//	public void user_Select_The_Year() throws Throwable {
//		dropDown(pom.getD().getCc_exp_year(), "selectbyvalue", "2022");
//	}
//
//	@When("^user Enter The Cvv$")
//	public void user_Enter_The_Cvv() throws Throwable {
//		sendKeys(pom.getD().getCc_cvv(),"000");
//	}
//
//	@Then("^Click the Submit Button$")
//	public void click_the_Submit_Button() throws Throwable {
//		click(pom.getD().getBook_now());
//	}
//
//	@Then("^Click The Logout button$")
//	public void click_The_Logout_button() throws Throwable {
//		click(pom.getD().getBook_now());
//	}
//
//
}
