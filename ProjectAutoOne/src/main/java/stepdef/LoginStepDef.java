package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AutomationPracticePage;

public class LoginStepDef {
	
	   WebDriver driver;
	   Action action;

	@Given("user is on home page")
	public void user_is_on_home_page() {
	 aps= new  AutomationPracticePage();
	}
	
	@When("user click on shop btn")
	public void user_click_on_shop_btn() {
		 aps.clickShop();
	}
	
	@When("user clicks on home  btn")
	public void user_clicks_on_home_btn() {
		 aps.clickHome();
	}
	@Then("count sliders")
	public void count_sliders() {

    aps.clickSlidder1();
	    aps.cickSlidder2();
	    aps.clickSlidder3();
	}




}
