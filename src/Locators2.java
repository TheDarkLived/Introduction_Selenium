import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Similar al archivo Locators, probando cosas de distinta forma
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("marc");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("contraseñaaa");
		
		// Igual que a sobre. Al posar * permet buscar posant nomes les primeres lletres
		//driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("contraseñaaa");
		
		// A partir de aquí espera a ejecutarse 2 segundos
		// Sirve sobretodo si hay cosas de la página que nada más cargar aún no aparecen (un botón, ... Para mensajes de error, mejor usar implicitlyWait)
		Thread.sleep(2000);
		
		// Si hay algo escrito en el input, lo borra
		driver.findElement(By.cssSelector("input[id='password']")).clear();
		
		
		
	
	}

}
