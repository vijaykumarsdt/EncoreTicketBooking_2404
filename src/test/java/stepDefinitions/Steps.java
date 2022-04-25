package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;

public class Steps {

	public WebDriver driver;
	String driverpath = "D:/01.Automation/EncoreTicketBooking/EncoreTicketBooking_2404/Drivers/chromedriver.exe";

	@Given("the use opens the Encore ticket booking URL")
	public void the_use_opens_the_encore_ticket_booking_url() {

		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get("https://www.encoretickets.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@Given("Search for the paly with product id {int} or play name")
	public void search_for_the_paly_with_product_id_or_play_name(Integer int1) {

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("6320");

		driver.findElement(By.xpath("//*[@class='c-quick-search__item-name']")).click();

	}

	@Then("Select number of Seats")
	public void select_number_of_seats() {
		driver.findElement(By.xpath("//*[@id=\"edit-no-of-tickets\"] //option[contains(text(),'2 Tickets')]")).click();
	}

	@Then("Click on Find Tickets")
	public void click_on_find_tickets() {
		driver.findElement(By.xpath(
				"//*[@class=\"o-btn o-btn--block o-btn__cta o-btn__cta--primary c-quick-search__btn t-btn-super \"]"))
				.click();
	}

	@Then("Select the Month and Date as per the availability from the given API")
	public void select_the_month_and_date_as_per_the_availability_from_the_given_api() throws InterruptedException {
		driver.findElement(By.cssSelector("span[class=\"month-selector-navigation__month\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='month-selector__options'] //div[contains(text(),'May 2022')]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[aria-label='May 1, 2022']")).click();
		Thread.sleep(3000);
	}

	@Then("Select the Show time")
	public void select_the_show_time() {
		driver.findElement(By.xpath(
				"//*[@class='f-label__wrapper c-quick-search__timeslot full-fat-calendar__timeslot-label'] //*[contains(text(),'15:00')]"))
				.click();
	}

	@Then("Click on Pick Your Tickets button")
	public void click_on_pick_your_tickets_button() {
		driver.findElement(By.cssSelector(
				"button[class=\"o-btn o-btn__ticket o-btn--quicksearch o-btn__cta o-btn__cta--primary u-w--100% t-btn t-btn-super\"]"))
				.click();
	}

	@Then("Click on the allocated seats taken from API")
	public void click_on_the_allocated_seats_taken_from_api() {
		driver.findElement(By.cssSelector("div[data-app$='venue-app']")).click();
		System.out.println("Select Seats from groupIdentifier: GRAND CIRCLE~B25;26 ");
	}

	@Then("go to the Payment Section and Complete the Payments")
	public void go_to_the_payment_section_and_complete_the_payments() {

		System.out.println("Once the Seats been selected , page will move to Payment Section ");
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
	}

}
