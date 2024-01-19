package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Appsuretechnologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MohanaPriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Panchatcharam");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt = new Select(source);
		opt.selectByVisibleText("Employee");
		WebElement Marketing =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt1 = new Select(Marketing);
		opt1.selectByVisibleText("Automobile");
		WebElement Ownership =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt2 = new Select(Ownership);
		opt2.selectByVisibleText("Corporation");
		driver.findElement(By.className("smallSubmit")).click();
		String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		  String i = driver.getCurrentUrl();
		  System.out.println("current page title Is : "+i);
		  if(j==i)
			  
		  {
			  System.out.println("success");
		  }
		  else
		  {
			  System.out.println("not success");
		  }
		  Thread.sleep(8000);
		  driver.close();
		
}
}
