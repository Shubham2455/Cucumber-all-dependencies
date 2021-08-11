package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

	WebDriver driver;

	@Given("^user should be open the link$")
	public void user_should_be_open_the_link() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"F:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^user should be entered u-name and password$")
	public void user_should_be_entered_u_name_and_password() throws Throwable {
		driver.findElement(
				By.xpath("//div/span[@id='nav-link-accountList-nav-line-1']"))
				.click();
		driver.findElement(By.xpath("//input[@id='ap_email']"))
				.sendKeys("9403513214");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys("9403513214");
	}

	@When("^user should click on login button$")
	public void user_should_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	}

	@SuppressWarnings("deprecation")
	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		WebElement textElement = driver
				.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		if (textElement.isDisplayed()) {
			System.out.println("login to amezon successfully");
		}
	}

	@Given("^user should enter the product in searchbox$")
	public void user_should_enter_the_product_in_searchbox() throws Throwable {

		driver.findElement(By.xpath("//div[@id='nav-search']"));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
				.sendKeys("samsung mobiles");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
				.click();

	}
}
