import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Similar al archivo Locators, probando cosas de distinta forma
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("marc");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("contraseñaaa");
		
		// Si hay algo escrito en el input, lo borra
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		
	
	}

}
