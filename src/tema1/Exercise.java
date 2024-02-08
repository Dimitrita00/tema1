package tema1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		
//		Homework number 1
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.maximum.md");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.cssSelector("body > div.wrap-blue-line > div > div > div.header__bottom__buttons > div > div > div.main_wrap_cabinet.hidden-sm.disabled > a > i")).click();
				
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("body > div.container_banner > div > div > div.brd-cat-container > div > div > ul > li:nth-child(2) > a")).click();
		 
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("#header > div > div > div > div.col-md-6.col-sm-12.hidden-sm > ul > li:nth-child(1) > a")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("#header > div > div > div > div.col-md-6.col-sm-12.hidden-sm > ul > li:nth-child(3) > a")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("#header > div > div > div > div.col-md-6.col-sm-12.hidden-sm > ul > li:nth-child(2) > a")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("body > div.container_banner > div > div > div.brd-cat-container > div > div > ul > li:nth-child(7) > a")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("body > div.container_banner > div > div > div.brd-cat-container > div > div > ul > li:nth-child(8) > a")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("body > div.container_banner > div > div > div.brd-cat-container > div > div > ul > li:nth-child(13) > a > span")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("body > div.container_banner > div > div > div.brd-cat-container > div > div > ul > li:nth-child(1) > a")).click();
		
		driverChrome.get("https://www.maximum.md");
		driverChrome.findElement(By.cssSelector("body > div.container_banner > div > div > div.brd-cat-container > div > div > ul > li:nth-child(4) > a")).click();
				
	}

}
