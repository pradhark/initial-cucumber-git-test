package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STest {

	WebDriver driver;	

	@Given("^Open Firefox browser and start the application$")
	public void open_Firefox_browser_and_start_the_application() throws Throwable {

		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("^Enter the valid \"(.*?)\" and \"(.*?)\"$")
	public void enter_the_valid_and(String arg1, String arg2) throws Throwable {

		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {

		driver.findElement(By.xpath("//input[@value ='Log In']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {

		driver.quit();
	}
}



