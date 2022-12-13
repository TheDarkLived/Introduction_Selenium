import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para poder detectar el mensaje de error, hay que usar manage... para que espere
		// unos segundos para poder leer el error (nada más abrir chrome no hay error que leer, petará)
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.findElement(By.id("email")).sendKeys("marc");
		
		// Igual que el de just a sobre, pero utilitzant xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("holi");
		
		driver.findElement(By.name("password")).sendKeys("holi");
		driver.findElement(By.className("btn-primary")).click();
		
		// Lo siguiente muestra el mensaje de error por log
		System.out.println(driver.findElement(By.cssSelector("span.text-with-icon")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		
	
	}

}
