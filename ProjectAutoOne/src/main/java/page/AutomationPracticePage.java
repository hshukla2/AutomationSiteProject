package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AutomationPracticePage extends TestBase{
	@FindBy(xpath = "//*[@id=\"menu-item-40\"]/a")
	WebElement shop;
	@FindBy(xpath = "//*[@id=\"content\"]/nav/a")
	WebElement home;
	@FindBy(xpath = "//*[@id=\"n2-ss-6-arrow-next\"]/img")
	WebElement slider1;
	@FindBy(xpath = "//*[@id=\"n2-ss-6-arrow-next\"]/img")
	WebElement slider2;
	@FindBy(xpath = "//*[@id=\"n2-ss-6-arrow-next\"]/img")
	WebElement slider3;
   
	public  AutomationPracticePage() {
		init();
		PageFactory.initElements(driver, this);
	}

	public void shopBtn() {
		shop.click();
		
	}
	
	public void homeMenu() {
		home.click();
		
	}
	
	public void sliders() throws InterruptedException {
		slider1.click();
		Thread.sleep(2000);
		
		slider2.click();
		Thread.sleep(2000);
		
		slider3.click();
		Thread.sleep(2000);
	}
}
