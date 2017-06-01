package cls4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class htmltable {

	public static void main(String[] args) {
WebDriver fd = new FirefoxDriver();
		
		fd.get("http://www.homeloanshub.com/mortgage-calculator/");
		fd.manage().window().maximize();
		String tenure = "5";
		fd.findElement(By.name("principal")).sendKeys("10000");
		fd.findElement(By.name("interest")).sendKeys("10");
		fd.findElement(By.name("tenure")).sendKeys(tenure);
		
		fd.findElement(By.xpath("//input[@class='btn1' and @value='Calculate']")).click();
		
		int tn = Integer.parseInt(tenure);
		int duration=tn * 12;
		
		List<WebElement> rowelement = fd.findElements(By.xpath("//div[@id='emiresults']/table/tbody/tr"));
		
		String outputs = fd.findElement(By.xpath("//div[@id='emiresults']/table/tbody//td[text()='" + duration + "']/../td[2]")).getText();
		System.out.println("output is: " + outputs);
		System.out.println("--------------");
		for(int i=0;i<rowelement.size();i++){
			System.out.println(rowelement.get(i).getText());
		}
		
		int rowcount = rowelement.size();
		System.out.println("rowcount="+rowcount);
		System.out.println("last row " + fd.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr["+ rowcount +"]/td[2]")).getText());
		for(int i = 1;i<rowcount;i++){
			//div[@id='emiresults']/table/tbody/tr[1]/td[2]
			//div[@id='emiresults']/table/tbody/tr[2]/td[2]
			//div[@id='emiresults']/table/tbody/tr[3]/td[2]
			
				String months = fd.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr["+ (i+1) +"]/td[1]")).getText();
				System.out.println(months);	
				
				int appmonths = Integer.parseInt(months);
				System.out.println( appmonths);
				if(duration==appmonths){
					
					String EMI = fd.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr["+ (i+1) +"]/td[2]")).getText();
					System.out.println(EMI);
					break;
				}
					
			
		}		
	}

}
