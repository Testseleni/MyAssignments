package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					ChromeDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.get("https://www.leafground.com/radio.xhtml");
					
					//1.Select 'Your most favourite browser' from the radio buttons
				WebElement ele = driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[2]/div[1]/div[2]/span[1]"));
				ele.click();
				driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).click();
				//2.Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
					driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]")).click();
				WebElement	selec =driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]"));
						selec.click();
			if(selec.isEnabled())	
			{
				System.out.println("The button is still selected");
			}
			else
			{ 
				System.out.println("The button is unselected");
			
			}
			
			//3 Identify the radio button that is initially selected by default.
			WebElement sel = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]"));
			if(sel.isEnabled())	
			{
				System.out.println("the radio button that is initially selected");
			}
			else
			{ System.out.println("unselected");
			}
			
			//4.Check and select the age group (21-40 Years) if not already selected.
			WebElement sel1 = driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]"));
			if(sel1.isEnabled())	
			{
				System.out.println("is already selected");
			}
			else
			{ System.out.println("unselected");
			}
			
			}
}
	
