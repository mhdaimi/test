package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	@Given("^User is on home page of website$")
	public void user_is_on_home_page_of_website() throws Throwable {
	    System.out.println("homepage");
	}

	@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
	    System.out.println(username + " " + password);
	}

	@Then("^Flight booking page is displayed$")
	public void flight_booking_page_is_displayed() throws Throwable {
	    System.out.println("Flight booking page");
	}

}
