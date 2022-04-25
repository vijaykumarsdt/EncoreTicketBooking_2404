package Reference;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class BaseScriptApproach {

	public static void main(String[] args) throws InterruptedException {

		// CHROME DRIVER
		System.setProperty("webdriver.chrome.driver",
				"D:\\01.Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Firefox DRIVER
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\01.Automation\\Drivers\\chromedriver_win32\\gecko.exe"); //path
		// WebDriver driver = new FirefoxDriver();

		// Edge DRIVER
		// System.setProperty("webdriver.edge.driver",
		// "D:\\01.Automation\\Drivers\\chromedriver_win32\\msedgedriver.exe.exe");
		// //path
		// WebDriver driver = new EdgeDriver();

		// WebDriverManager.chromedriver().setup(); // Calling setup() automatically
		// puts the correct browser driver where the code will see it

		// driver.get("https://rahulshettyacademy.com");

		driver.get("https://www.encoretickets.co.uk/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.getTitle();
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("6320");
		Thread.sleep(5);
		driver.findElement(By.xpath("//*[@class='c-quick-search__item-name']")).click();

		// driver.findElement(By.id("inventory__quantity")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"edit-no-of-tickets\"] //option[contains(text(),'2 Tickets')]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@class=\"o-btn o-btn--block o-btn__cta o-btn__cta--primary c-quick-search__btn t-btn-super \"]"))
				.click();

		Thread.sleep(5000);

		// Change the Date to May 01 2022

		driver.findElement(By.cssSelector("span[class=\"month-selector-navigation__month\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='month-selector__options'] //div[contains(text(),'May 2022')]"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("span[aria-label='May 1, 2022']")).click();

		driver.findElement(By.xpath(
				"//*[@class='f-label__wrapper c-quick-search__timeslot full-fat-calendar__timeslot-label'] //*[contains(text(),'15:00')]"))
				.click();

		driver.findElement(By.cssSelector(
				"button[class=\"o-btn o-btn__ticket o-btn--quicksearch o-btn__cta o-btn__cta--primary u-w--100% t-btn t-btn-super\"]"))
				.click();

		Thread.sleep(10000);

		System.out.println("Waited for 10 secs");

		System.out.println("Date and time selected");

		// clicking on Stalls

		driver.findElement(By.cssSelector("div[data-app$='venue-app']")).click();

		Thread.sleep(5000);

		System.out.println("Select Seats from groupIdentifier: GRAND CIRCLE~B25;26 ");

		// driver.findElement(By.xpath("(.//*[normalize-space(text()) and
		// normalize-space(.)='�'])[1]/preceding::div[5]")).click();

		Thread.sleep(5000);
		// driver.close();
		// driver.quit();
		System.out.println("Test Case Passed up selection of Seats ");

	}

}
