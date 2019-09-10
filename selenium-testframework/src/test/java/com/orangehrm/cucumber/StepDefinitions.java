package com.orangehrm.cucumber;

import com.selenium_framework.common.WebDriverFactory;
import com.selenium_framework.pages.AddUserPage;
import com.selenium_framework.pages.HomePage;
import com.selenium_framework.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	
	@Given("I open chrome browser")
	public void i_open_chrome_browser() {
	    WebDriverFactory.createWebDriverInstance();
	}

	@Given("navigate to orangeHRM")
	public void navigate_to_orangeHRM() {
	    WebDriverFactory.getDriver().get("http://127.0.0.1/orangehrm-3.3.1/");
	}

	@When("I login")
	public void i_login() {
	    LoginPage lp = new LoginPage();
	    lp.login("admin", "admin");
	}

	@Then("I verify welcome text as {string}")
	public void i_verify_welcome_text_as(String string) {
		HomePage hp = new HomePage();
		hp.verifyAdminLink();		
	}

	
	
	@When("I navigate to Add user page") //Add user page
	public void i_navigate_to_Add_user_page() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage hp= new HomePage();
		hp.naviagateToAdminPage();
	   
	   
	}

	@Then("Add User")
	public void add_User() {
	    // Write code here that turns the phrase above into concrete actions
		AddUserPage ap= new AddUserPage();
		ap.addUser("User1", "gajanan", "gajanan", "gajanan");
	}



}
