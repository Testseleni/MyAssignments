package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("755");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9751504224");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Mugunth']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("12937");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String display=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		  System.out.println("Your page title Is : "+display);
		  String sucess = "No records to display";
		  System.out.println("Your page title Is : "+sucess);
		   
 if(sucess.equals(display))
			  
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
