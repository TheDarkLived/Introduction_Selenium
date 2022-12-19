import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		
		// Pone un usuario/password incorrecto
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("incorrecto");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("asdasd");
		
		// Se clica un checkbox
		driver.findElement(By.id("terms")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='signInBtn'])")).click();
		
		
		Thread.sleep(3000);
		
		// Compara que el mensaje sea el mismo que ponemos en el valor de la derecha (incorrect...). Si aparece log de error, es que el mensaje NO es igual
		Assert.assertEquals(driver.findElement(By.className("alert-danger")).getText(), "Incorrect username/password.");
		
		// Este si dará error
		Assert.assertEquals(driver.findElement(By.className("alert-danger")).getText(), "Incorrect username/passworddddddddddd.");


	}

}