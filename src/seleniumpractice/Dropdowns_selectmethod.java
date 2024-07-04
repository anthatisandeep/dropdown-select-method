package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_selectmethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting dropdowns option using Option Name
				new Select(driver.findElement(By.id("day")))
				.selectByVisibleText("16");
				
				//Selecting dropdowns option using value property
				new Select(driver.findElement(By.id("month")))
				.selectByValue("8");
				
				//selecting dropdowns option using option tag index number under select tag
				new Select(driver.findElement(By.id("year")))
				.selectByIndex(10);
		
		
		
		
		
	}

}
