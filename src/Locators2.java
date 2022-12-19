import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
	
		// Se loguea como usuario (no admin) correctamente

		// Similar al archivo Locators, probando cosas de distinta forma
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		
		// Se clica un checkbox
		driver.findElement(By.id("terms")).click();
		
		// Igual que a sobre. Al posar * permet buscar posant nomes les primeres lletres
		//driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("contraseñaaa");
		
		// A partir de aquí espera a ejecutarse 2 segundos
		// Sirve sobretodo si hay cosas de la página que nada más cargar aún no aparecen (un botón, ... Para mensajes de error, mejor usar implicitlyWait)
		
		// Si hay algo escrito en el input, lo borra
		//driver.findElement(By.cssSelector("input[id='password']")).clear();
		
		// Si hay varios elementos que se llaman igual (por ejemplo 2 inputs y los 2 tienen como nombre de clase "checkmark"), puedes indicar a cual te refieres poniendo [] al final
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		// Espera 3 segundos (para que se abra el pop-up) y entonces clica al botón
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@id='okayBtn'])")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='signInBtn'])")).click();
	
	}

}
