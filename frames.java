package cls4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {

	public static void main(String[] args) {
//		FirefoxDriver fd = new FirefoxDriver();
//		fd.get("https://paytm.com/");
//		fd.manage().window().maximize();
//		fd.findElement(By.xpath("//div[@class='_3ac-']")).click();
//		WebElement frm = fd.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
//		fd.switchTo().frame(frm);
//		fd.findElement(By.name("username")).sendKeys("ramesh@gmail.com");
//		fd.close();
//		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://paytm.com/");
		fd.manage().window().maximize();
		System.out.println("adding to git");
		fd.findElement(By.xpath("//div[@class='_3ac-']")).click();
		WebElement frm = fd.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		fd.switchTo().frame(frm);
		fd.findElement(By.id("input_0")).sendKeys("Rajesh@gmail.com");
		fd.switchTo().defaultContent();
		fd.close();
		
		
	}

}
