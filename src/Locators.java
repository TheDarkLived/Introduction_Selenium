import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.findElement(By.id("email")).sendKeys("marc");
		driver.findElement(By.name("password")).sendKeys("holi");
		driver.findElement(By.className("btn-primary")).click();
	}

}
