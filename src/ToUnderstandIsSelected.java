import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		WebElement radioButton = driver.findElement(By.id("gender-female"));
		
		System.out.println(radioButton.isSelected()); // false

		Thread.sleep(2000);
		radioButton.click();
		System.out.println(radioButton.isSelected()); // true

		if (radioButton.isSelected()) {
			System.out.println("Radio button is selected");
		} else {
			System.out.println("Radio button is not selected");
		}

	}

}
