package testesenai;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBuscarCursos {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/*
	@Test
	public void testeNavegador() {
		driver.get("https://informatica.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestao");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	*/
	
	@Test
	public void testeNavegador() {
		driver.get("https://www.mercadoLivre.com.br/");
		driver.findElement(By.className("nav-search-input")).sendKeys("teclado");
		driver.findElement(By.className("nav-search-btn")).click();
	}
}

