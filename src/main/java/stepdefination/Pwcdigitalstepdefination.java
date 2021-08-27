package stepdefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.math.NumberUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import objectrepository.Homepage;
import objectrepository.Searchpage;
import utility.commonMethod;

public class Pwcdigitalstepdefination  {
	
	WebDriver driver;
	commonMethod cm=new commonMethod();

	@Given("I navigate to the PwC Digital Pulse website")
	public void i_navigate_to_the_pw_c_digital_pulse_website() throws IOException {
		

		System.setProperty("webdriver.chrome.driver", cm.property_file_reading("ChromeDriverPath"));
		driver = new ChromeDriver();
		driver.get(cm.property_file_reading("ApplicationURL"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@When("I click on the Magnifying glass icon to perform a search")
	public void i_click_on_the_icon_to_perform_a_search() {
	    driver.findElement(Homepage.btn_search).click();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@When("I enter the text {string}")
	public void i_enter_the_text(String string) throws IOException {
		driver.findElement(Homepage.txtbox_search).sendKeys(cm.property_file_reading("SearchData"));
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@When("I submit the search")
	public void i_submit_the_search() {
		
		driver.findElement(Homepage.btn_searchsubmit).click();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    
	}
	@Then("I am taken to the search results page")
	public void i_am_taken_to_the_search_results_page() {
		String title=driver.getTitle();
		System.out.println("Title is:-"+title);
		Assert.assertEquals(title,"Search results" );
	}
	@Then("I am presented with atleast {int} search result")
	public void i_am_presented_with_atleast_search_result(Integer int1) {
		
		String Search=driver.findElement(Searchpage.txt_results).getAttribute("search-results");
		System.out.println(Search);
		int i = NumberUtils.toInt(Search);
		if(i>0)
		{System.out.println("Pass");
		
		}
		else
		{System.out.println("Fail");
		Assert.fail();}
		driver.close();
	}}


